package com.mpc.data.yelputil.configuration;

import com.mpc.data.yelputil.repository.BusinessRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.type.AnnotatedTypeMetadata;

@Configuration
@EnableConfigurationProperties
@Conditional(Preloader.PreloaderConditional.class)
public class Preloader {

	@Bean
	CommandLineRunner doStuff(BusinessRepository businessRepository){

		return  args -> {

			System.out.println("Hello, World!");
			System.out.println("Hello, World!");
			System.out.println("Hello, World!");
		};
	}

	static class PreloaderConditional implements Condition {
		@Override
    	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
			System.out.println("PreloaderConditional matches");
			for (String bean : context.getRegistry().getBeanDefinitionNames()){
				System.out.println(bean);
			}
    		return true;
    	}
	}

}
