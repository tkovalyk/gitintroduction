package com.lvivit.gitintroduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitintroductionApplication {

	@Autowired
	private HelloWorldWriter helloWorldWriter;

	public static void main(String[] args) {
		SpringApplication.run(GitintroductionApplication.class, args);
	}
}
