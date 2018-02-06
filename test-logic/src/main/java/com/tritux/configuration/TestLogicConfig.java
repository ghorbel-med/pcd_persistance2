package com.tritux.configuration;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * 
 * @author hbc
 *
 */
@Configuration
@ComponentScan({"com.tritux.service"})
@Import({ PersistenceConfig.class })
public class TestLogicConfig {

	

	@Bean
	public PropertySourcesPlaceholderConfigurer propertyConfigurer() throws IOException {
		PropertySourcesPlaceholderConfigurer props = new PropertySourcesPlaceholderConfigurer();
		return props;
	}

}
