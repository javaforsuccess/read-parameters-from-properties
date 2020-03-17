package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.app.AppProperties;

@Configuration
public class AppConfig {

	@Value("${app.name}")
	private String name;
	
	@Value("${app.version}")
	private String version;
	
	@Bean 
	public AppProperties getAppProperties() {
		return new AppProperties(name, version);
	}

}
