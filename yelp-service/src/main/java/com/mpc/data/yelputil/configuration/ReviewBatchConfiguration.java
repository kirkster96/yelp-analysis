package com.mpc.data.yelputil.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mpc.data.yelputil.model.Review;
import com.mpc.data.yelputil.model.User;
import com.mpc.data.yelputil.service.ReviewService;
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
public class ReviewBatchConfiguration {

	@Bean
	public FlatFileItemReader<Review> reviewFlatFileItemReader(@Value("${data.reviewfile}") String reviewFilePath) {
		return new FlatFileItemReaderBuilder<Review>()
				.name("reviewFlatFileItemReader")
				.resource(new FileSystemResource(reviewFilePath))
				.lineMapper(new LineMapper<Review>() {
					ObjectMapper mapper = new ObjectMapper();
					@Override
					public Review mapLine(String line, int lineNumber) throws Exception {
						return mapper.readValue(line, Review.class);
					}
				})
				.build();
	}

	@Bean
	public ItemWriterAdapter<Review> reviewItemWriter(ReviewService reviewService) {
		return new ItemWriterAdapter<Review>() {
    		{
    			setTargetObject(reviewService);
    			setTargetMethod("write");
    		}
    	};
	}

	@Bean
	public Step reviewStep(TaskExecutor batchTaskExecutor,
			JobRepository jobRepository,
			PlatformTransactionManager transactionManager,
			FlatFileItemReader<Review> reviewFlatFileItemReader,
			ItemWriterAdapter<Review> reviewItemWriter) {

		return new StepBuilder("reviewStep", jobRepository)
				.<Review, Review>chunk(10, transactionManager)
				.reader(reviewFlatFileItemReader)
				.writer(reviewItemWriter)
				.taskExecutor(batchTaskExecutor)
				.build();
	}


//	a Job is simply a container for Step instances
	@Bean
	public Job reviewJob(JobRepository jobRepository, Step reviewStep){
		return new JobBuilder("reviewJob", jobRepository)
//				.validator(parametersValidator())
				.start(reviewStep)
				.build();
	}

	@Bean
	public JobParametersValidator reviewParametersValidator() {
		DefaultJobParametersValidator validator = new DefaultJobParametersValidator();
		validator.setRequiredKeys(new String[]{"fileName"});
		return validator;
	}

}
