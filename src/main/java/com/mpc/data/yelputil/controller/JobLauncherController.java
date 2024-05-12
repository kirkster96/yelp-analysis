package com.mpc.data.yelputil.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobLauncherController {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	private Job businessJob;

	@GetMapping("/jobLauncher.html")
	public void handle() throws Exception{
		jobLauncher.run(businessJob, new JobParameters());
	}

}
