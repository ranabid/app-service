package com.example.app.webservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/api/hi")
	public String hi() {
		return "Hello World from Restful API";
	}
}