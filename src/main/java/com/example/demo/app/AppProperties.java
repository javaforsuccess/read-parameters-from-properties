package com.example.demo.app;

import org.springframework.beans.factory.annotation.Value;

public class AppProperties {
	
	
	private String name;
	
	private String version;

	public AppProperties() {
	}

	public AppProperties(String name, String version) {
		super();
		this.name = name;
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
		
}
