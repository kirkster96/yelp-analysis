package com.mpc.data.yelputil.repository;

import com.mpc.data.yelputil.model.CheckIn;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CheckInRepository extends MongoRepository<CheckIn, String> {

}
