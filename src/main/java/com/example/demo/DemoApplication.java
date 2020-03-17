package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.app.AppProperties;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	private AppProperties appProperties;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void doSomethingAfterStartup() {
	    System.out.println("------START-----");
	    System.out.println("APP NAME :\t"+appProperties.getName());
	    System.out.println("APP VERSION :\t"+appProperties.getVersion());
	    System.out.println("-----END-----");
	}
}
