package com.mpc.data.yelputil.configuration;

import org.openapitools.configuration.HomeController;
import org.openapitools.configuration.SpringDocConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({HomeController.class, SpringDocConfiguration.class})
public class OasConfiguration {
}
