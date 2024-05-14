package com.mpc.data.yelputil.service;

import com.mpc.data.yelputil.model.CheckIn;
import com.mpc.data.yelputil.repository.CheckInRepository;

import org.springframework.stereotype.Service;

@Service
public class CheckInService {

	private final CheckInRepository checkInRepository;

	public CheckInService(CheckInRepository checkInRepository) {
		this.checkInRepository = checkInRepository;
	}

	public void write(CheckIn checkIn) {
		checkInRepository.save(checkIn);
	}
}
