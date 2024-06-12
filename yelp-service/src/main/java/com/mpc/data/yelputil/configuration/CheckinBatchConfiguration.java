package com.mpc.data.yelputil.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mpc.data.yelputil.model.CheckIn;
import com.mpc.data.yelputil.service.CheckInService;

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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class CheckinBatchConfiguration{

	@Bean
	public FlatFileItemReader<CheckIn> checkInFlatFileItemReader(@Value("${data.checkinfile}") String checkinFilePath) {
		return new FlatFileItemReaderBuilder<CheckIn>()
				.name("checkinFlatFileItemReader")
				.resource(new FileSystemResource(checkinFilePath))
				.lineMapper(new LineMapper<CheckIn>() {
					ObjectMapper mapper = new ObjectMapper();
					@Override
					public CheckIn mapLine(String line, int lineNumber) throws Exception {
						return mapper.readValue(line, CheckIn.class);
					}
				})
				.build();
	}

	@Bean
	public ItemWriterAdapter<CheckIn> checkInItemWriter(CheckInService checkInService) {
		return new ItemWriterAdapter<CheckIn>() {
    		{
    			setTargetObject(checkInService);
    			setTargetMethod("write");
    		}
    	};
	}

	@Bean
	public Step checkinStep(JobRepository jobRepository,
			PlatformTransactionManager transactionManager,
			FlatFileItemReader<CheckIn> checkInFlatFileItemReader,
			ItemWriterAdapter<CheckIn> checkInItemWriter) {

		return new StepBuilder("checkinStep", jobRepository)
				.<CheckIn, CheckIn>chunk(10, transactionManager)
				.reader(checkInFlatFileItemReader)
				.writer(checkInItemWriter)
				.build();
	}


//	a Job is simply a container for Step instances
	@Bean
	public Job checkinJob(JobRepository jobRepository, Step checkinStep){
		return new JobBuilder("checkinJob", jobRepository)
//				.validator(parametersValidator())
				.start(checkinStep)
				.build();
	}

	@Bean
	public JobParametersValidator checkinParametersValidator() {
		DefaultJobParametersValidator validator = new DefaultJobParametersValidator();
		validator.setRequiredKeys(new String[]{"fileName"});
		return validator;
	}

}
