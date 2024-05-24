package com.example.jenkins.pipeline.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringJenkinsPipelineDemoApplication {

	@GetMapping("/example")
	public String Example(){
		return "Spring boot app jenkins pipeline demo!!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsPipelineDemoApplication.class, args);
	}

}
