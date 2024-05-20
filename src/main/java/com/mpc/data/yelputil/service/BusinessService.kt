package com.mpc.data.yelputil.service

import com.mpc.data.yelputil.model.Business
import com.mpc.data.yelputil.repository.BusinessRepository
import org.springframework.stereotype.Service

interface BusinessService {
    fun write(business: Business?)
}

@Service
class BusinessServiceImpl(private val businessRepository: BusinessRepository) : BusinessService {
    override fun write(business: Business?) {
        if (business != null) {
            businessRepository.save(business)
        }
    }
}