package com.example.vensai.SpringBootWarDeploymentApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarDeploymentApplicationController {

	@GetMapping("/wardeployment")
	public String message() {
		return "War Deployment";
	}
}
