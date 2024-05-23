package com.mpc.data.yelputil.controller;

import java.util.List;

import com.mpc.data.yelputil.model.Review;
import com.mpc.data.yelputil.service.ReviewService;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobLauncherController {

	private final JobLauncher jobLauncher;
	private final Job businessJob;
	private final Job checkinJob;
	private final Job userJob;
	private final Job reviewJob;
	private final JobExplorer jobExplorer;
	private final ReviewService reviewService;

	public JobLauncherController(JobLauncher jobLauncher, Job businessJob, Job checkinJob, Job userJob, Job reviewJob, JobExplorer jobExplorer, ReviewService reviewService) {
		this.jobLauncher = jobLauncher;
		this.businessJob = businessJob;
		this.checkinJob = checkinJob;
		this.userJob = userJob;
		this.reviewJob = reviewJob;
		this.jobExplorer = jobExplorer;
		this.reviewService = reviewService;
	}

	@GetMapping("/reviews/{id}")
	@Cacheable("cache1")
	public Review getReviews(@PathVariable("id") String id){

		try {
			// time in milliseconds
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return reviewService.read(id);
	}



	@GetMapping("/jobLauncher")
	public String handle() {

		JobExecution exec;
		try {
			exec = jobLauncher.run(businessJob, new JobParameters());
			jobLauncher.run(checkinJob, new JobParameters());
			jobLauncher.run(userJob, new JobParameters());
			jobLauncher.run(reviewJob, new JobParameters());
		} catch (JobExecutionAlreadyRunningException e) {
			return e.getMessage();
		} catch (JobRestartException e) {
			return e.getMessage();
		} catch (JobInstanceAlreadyCompleteException e) {
			return e.getMessage();
		} catch (JobParametersInvalidException e) {
			return e.getMessage();
		}
		return exec.toString();
	}

}
