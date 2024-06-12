package com.mpc.data.yelputil.controller;

import org.openapitools.api.BusinessesApi;
import org.openapitools.model.Business;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class BusinessesApiController implements BusinessesApi {


	@Override
	public ResponseEntity<Business> getBusiness(String businessId) throws Exception {
		return null;
	}
}
