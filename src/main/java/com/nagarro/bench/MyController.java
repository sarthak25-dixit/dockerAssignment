package com.nagarro.bench;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/docker_task")
	public String getAnswer() {
		return "Welcome to docker task demo";
	}
}

