package com.mpc.data.yelputil.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mpc.data.yelputil.model.CheckIn;
import com.mpc.data.yelputil.model.User;
import com.mpc.data.yelputil.service.CheckInService;
import com.mpc.data.yelputil.service.UserService;

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
import org.springframework.core.task.TaskExecutor;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class UserBatchConfiguration {

	@Bean
	public FlatFileItemReader<User> userFlatFileItemReader(@Value("${data.userfile}") String userFilePath) {
		return new FlatFileItemReaderBuilder<User>()
				.name("userFlatFileItemReader")
				.resource(new FileSystemResource(userFilePath))
				.lineMapper(new LineMapper<User>() {
					ObjectMapper mapper = new ObjectMapper();
					@Override
					public User mapLine(String line, int lineNumber) throws Exception {
						return mapper.readValue(line, User.class);
					}
				})
				.build();
	}

	@Bean
	public ItemWriterAdapter<User> userItemWriter(UserService userService) {
		return new ItemWriterAdapter<User>() {
    		{
    			setTargetObject(userService);
    			setTargetMethod("write");
    		}
    	};
	}

	@Bean
	public Step userStep(TaskExecutor batchTaskExecutor,
			JobRepository jobRepository,
			PlatformTransactionManager transactionManager,
			FlatFileItemReader<User> userFlatFileItemReader,
			ItemWriterAdapter<User> userItemWriter) {

		return new StepBuilder("userStep", jobRepository)
				.<User, User>chunk(10, transactionManager)
				.reader(userFlatFileItemReader)
				.writer(userItemWriter)
				.taskExecutor(batchTaskExecutor)
				.build();
	}


//	a Job is simply a container for Step instances
	@Bean
	public Job userJob(JobRepository jobRepository, Step userStep){
		return new JobBuilder("userJob", jobRepository)
//				.validator(parametersValidator())
				.start(userStep)
				.build();
	}

	@Bean
	public JobParametersValidator userParametersValidator() {
		DefaultJobParametersValidator validator = new DefaultJobParametersValidator();
		validator.setRequiredKeys(new String[]{"fileName"});
		return validator;
	}

}
