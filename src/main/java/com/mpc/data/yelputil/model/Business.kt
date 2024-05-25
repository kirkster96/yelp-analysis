package com.mpc.data.yelputil.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document("businesses")
data class Business(
    @Id val business_id: String?,
    val name: String?,
    val address: String?,
    val city: String?,
    val state: String?,
    val postal_code: String?,
    val latitude: Double?,
    val longitude: Double?,
    val stars: Float?,
    val review_count: Int?,
    val is_open: Int?,
    val attributes: Map<String, Any>?,
    val categories: String?,
    val hours: Map<String, String>?
)