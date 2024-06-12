package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Yelp Analysis API")
                                .description("This is the ***Yelp Analysis API***. View the documentation below to understand the types of requests that can be made to this server from clients. You can find out more about Swagger at [swagger.io](http://swagger.io). ")
                                .termsOfService("https://github.com/kirkster96/yelp-analysis/blob/master/LICENSE")
                                .contact(
                                        new Contact()
                                                .name("Yelp Analysis")
                                                .url("https://github.com/kirkster96/yelp-analysis")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("https://github.com/kirkster96/yelp-analysis/blob/master/LICENSE")
                                )
                                .version("1.0.0")
                )
        ;
    }
}