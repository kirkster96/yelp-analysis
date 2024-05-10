package com.mpc.data.yelputil;

import com.mpc.data.yelputil.repository.BusinessRepository;

import org.springframework.stereotype.Component;

@Component
public class BusinessUtil {

	private final BusinessRepository businessRepository;

	public BusinessUtil(BusinessRepository businessRepository) {

		this.businessRepository = businessRepository;

	}
}
