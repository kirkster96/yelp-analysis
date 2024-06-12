package com.mpc.data.yelputil.repository;

import com.mpc.data.yelputil.model.Review;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepository extends MongoRepository<Review, String> {

}
