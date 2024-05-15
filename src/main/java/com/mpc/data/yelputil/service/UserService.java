package com.mpc.data.yelputil.service;

import com.mpc.data.yelputil.model.CheckIn;
import com.mpc.data.yelputil.model.User;
import com.mpc.data.yelputil.repository.CheckInRepository;
import com.mpc.data.yelputil.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void write(User user) {
		userRepository.save(user);
	}
}
