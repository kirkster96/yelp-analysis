package com.mpc.data.yelputil.configuration;

import java.net.MalformedURLException;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import com.mpc.data.yelputil.model.Business;
import com.mpc.data.yelputil.service.BusinessService;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.DefaultJobParametersValidator;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.adapter.ItemWriterAdapter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileUrlResource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BusinessBatchConfiguration{

	@Bean
	public JsonItemReader<Business> businessJsonItemReader( @Value("${data.businessfile}") String businessFilePath) {
		try {
			// This fails because input file is not in JSON array
			return new JsonItemReaderBuilder<Business>()
					.jsonObjectReader(new JacksonJsonObjectReader<>(Business.class))
					.resource(new FileUrlResource(businessFilePath))
					.name("businessJsonItemReader")
					.build();
		} catch (MalformedURLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Bean
	public FlatFileItemReader<Business> businessFlatFileItemReader(@Value("${data.businessfile}") String businessFilePath) {
		return new FlatFileItemReaderBuilder<Business>()
    			.name("businessFlatFileItemReader")
    			.resource(new FileSystemResource(businessFilePath))
				.lineMapper(new LineMapper<Business>() {
					ObjectMapper mapper = new ObjectMapper().registerModule(new KotlinModule());
					@Override
					public Business mapLine(String line, int lineNumber) throws Exception {
						return mapper.readValue(line, Business.class);
					}
				})
    			.build();
	}

	@Bean
	public ItemWriterAdapter<Business> businessItemWriter(BusinessService businessService) {
		return new ItemWriterAdapter<Business>() {
    		{
    			setTargetObject(businessService);
    			setTargetMethod("write");
    		}
    	};
	}

	@Bean
	public Step businessStep(JobRepository jobRepository,
			PlatformTransactionManager transactionManager,
			FlatFileItemReader<Business> businessFlatFileItemReader,
			ItemWriterAdapter<Business> businessItemWriter) {
		return new StepBuilder("businessStep", jobRepository)
				.<Business, Business>chunk(10, transactionManager)
				.reader(businessFlatFileItemReader)
				.writer(businessItemWriter)
				.build();
	}


//	a Job is simply a container for Step instances
	@Bean
	public Job businessJob(JobRepository jobRepository, Step businessStep){
		return new JobBuilder("businessJob", jobRepository)
//				.validator(parametersValidator())
				.start(businessStep)
				.build();
	}

	@Bean
	public JobParametersValidator businessParametersValidator() {
		DefaultJobParametersValidator validator = new DefaultJobParametersValidator();
		validator.setRequiredKeys(new String[]{"fileName"});
		return validator;
	}

}
