package com.mpc.data.yelputil.model;

import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("businesses")
public record Business(
		@Id String business_id,
		String name,
		String address,
		String city,
		String state,
		String postal_code,
		Double latitude,
		Double longitude,
		Float stars,
		Integer review_count,
		Integer is_open,
		Map<String, String> attributes,
		String categories,
		Map<String, String> hours){
}
