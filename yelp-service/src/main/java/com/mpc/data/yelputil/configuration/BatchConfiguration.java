package com.mpc.data.yelputil.configuration;

import javax.sql.DataSource;

import org.springframework.batch.core.configuration.BatchConfigurationException;
import org.springframework.batch.core.configuration.support.DefaultBatchConfiguration;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.TaskExecutorJobLauncher;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.support.JdbcTransactionManager;

@Configuration
@EnableCaching
public class BatchConfiguration extends DefaultBatchConfiguration {

	@Bean
	public TaskExecutor batchTaskExecutor() {
		return new SimpleAsyncTaskExecutor("spring_batch");
	}

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

}
