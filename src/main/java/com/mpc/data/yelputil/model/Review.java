package com.mpc.data.yelputil.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("reviews")
public record Review(
		@Id String review_id,
		String user_id,
		String business_id,
		Float stars,
		Integer useful,
		Integer funny,
		Integer cool,
		String text,
		String date
) {
}
