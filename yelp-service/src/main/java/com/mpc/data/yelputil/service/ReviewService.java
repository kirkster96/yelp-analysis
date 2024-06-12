package com.mpc.data.yelputil.service;

import com.mpc.data.yelputil.model.Review;
import com.mpc.data.yelputil.model.User;
import com.mpc.data.yelputil.repository.ReviewRepository;
import com.mpc.data.yelputil.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class ReviewService {

	private final ReviewRepository reviewRepository;

	public ReviewService(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}

	public void write(Review review) {
		reviewRepository.save(review);
	}

	public Review read(String id) {
		return reviewRepository.findById(id).orElse(null);
	}
}
