package com.mpc.data.yelputil.model;

public record User(
		String user_id,
		String name,
		Integer review_count,
		String yelping_since,
		Integer useful,
		Integer funny,
		Integer cool,
		String elite,
		String friends,
		Integer fans,
		Float average_stars,
		Integer compliment_hot,
		Integer compliment_more,
		Integer compliment_profile,
		Integer compliment_cute,
		Integer compliment_list,
		Integer compliment_note,
		Integer compliment_plain,
		Integer compliment_cool,
		Integer compliment_funny,
		Integer compliment_writer,
		Integer compliment_photos
) {
}
