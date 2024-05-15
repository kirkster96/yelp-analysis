package com.mpc.data.yelputil.repository;

import com.mpc.data.yelputil.model.CheckIn;
import com.mpc.data.yelputil.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}
