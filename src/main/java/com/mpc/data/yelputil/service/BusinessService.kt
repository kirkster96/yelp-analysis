package com.mpc.data.yelputil.service;

import com.mpc.data.yelputil.model.Business;
import com.mpc.data.yelputil.repository.BusinessRepository;

import org.springframework.stereotype.Service;

@Service
public class BusinessService {
	private BusinessRepository businessRepository;

	public BusinessService(BusinessRepository businessRepository) {
		this.businessRepository = businessRepository;
	}

	public void write(Business business) {
		businessRepository.save(business);
	}

}
