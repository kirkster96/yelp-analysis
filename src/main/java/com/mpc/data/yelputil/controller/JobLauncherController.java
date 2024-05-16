package com.mpc.data.yelputil.controller;

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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobLauncherController {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job businessJob;

	@Autowired
	private Job checkinJob;

	@Autowired
	private Job userJob;

	@Autowired
	private Job reviewJob;

	@Autowired
	private JobExplorer jobExplorer;

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
