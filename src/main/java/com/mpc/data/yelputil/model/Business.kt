package com.mpc.data.yelputil.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document("businesses")
data class Business(
    @Id val businessId: String,
    val name: String,
    val address: String,
    val city: String,
    val state: String,
    val postalCode: String,
    val latitude: Double,
    val longitude: Double,
    val stars: Float,
    val reviewCount: Int,
    val isOpen: Int,
    val attributes: Map<String, String>,
    val categories: String,
    val hours: Map<String, String>
)