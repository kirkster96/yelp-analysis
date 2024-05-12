package com.mpc.data.yelputil.configuration;

import java.net.MalformedURLException;

import javax.sql.DataSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mpc.data.yelputil.model.Business;
import com.mpc.data.yelputil.service.BusinessService;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersValidator;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.BatchConfigurationException;
import org.springframework.batch.core.configuration.support.DefaultBatchConfiguration;
import org.springframework.batch.core.job.DefaultJobParametersValidator;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.TaskExecutorJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.adapter.ItemWriterAdapter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.json.JacksonJsonObjectReader;
import org.springframework.batch.item.json.JsonItemReader;
import org.springframework.batch.item.json.builder.JsonItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfiguration extends DefaultBatchConfiguration {

	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript("/org/springframework/batch/core/schema-h2.sql")
				.generateUniqueName(true).build();
	}

	@Bean
	public JdbcTransactionManager transactionManager(DataSource dataSource) {
		return new JdbcTransactionManager(dataSource);
	}

	@Bean
	@Override
	public JobLauncher jobLauncher() throws BatchConfigurationException {

		TaskExecutorJobLauncher taskExecutorJobLauncher = new TaskExecutorJobLauncher();
		taskExecutorJobLauncher.setJobRepository(this.jobRepository());
		taskExecutorJobLauncher.setTaskExecutor(new SimpleAsyncTaskExecutor()); //	launch from an HTTP request

		try {
			taskExecutorJobLauncher.afterPropertiesSet();
			return taskExecutorJobLauncher;
		} catch (Exception var3) {
			Exception e = var3;
			throw new BatchConfigurationException("Unable to configure the default job launcher", e);
		}
	}

	@Bean
	public JsonItemReader<Business> businessJsonItemReader( @Value("${data.business.file}") String businessFilePath) {
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
	public FlatFileItemReader<Business> businessFlatFileItemReader(@Value("${data.business.file}") String businessFilePath) {
		return new FlatFileItemReaderBuilder<Business>()
    			.name("businessFlatFileItemReader")
    			.resource(new FileSystemResource(businessFilePath))
				.lineMapper(new LineMapper<Business>() {
					ObjectMapper mapper = new ObjectMapper();
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
	public JobParametersValidator parametersValidator() {
		DefaultJobParametersValidator validator = new DefaultJobParametersValidator();
		validator.setRequiredKeys(new String[]{"fileName"});
		return validator;
	}

}
