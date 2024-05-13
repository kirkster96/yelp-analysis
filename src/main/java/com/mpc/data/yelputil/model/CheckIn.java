package com.mpc.data.yelputil.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("checkins")
public record CheckIn(
		@Id String business_id,
		String date
) {
}
