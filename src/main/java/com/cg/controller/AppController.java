package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/app")
public class AppController {
	
	@GetMapping("/check")
	public String checkMethod() {
		return "Checked successfully";
	}

	@GetMapping("/check2")
	public String checkMethod2() {
		return "Checked two successfully";
	}

}
