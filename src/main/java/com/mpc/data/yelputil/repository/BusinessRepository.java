package com.mpc.data.yelputil.repository;

import com.mpc.data.yelputil.model.Business;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BusinessRepository extends MongoRepository<Business, String> {

	public void deleteAll();
}
