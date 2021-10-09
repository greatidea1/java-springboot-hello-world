package com.javatpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api4")
public class RedirectTestController {
	
	@GetMapping("/index")
	public String getIndex() {
		return "<html><h1>This is index page</h1></html>";
	}
	
	@GetMapping("/default")
	public String getDefault() {
		return "<html><h1>This is redirected default page</h1></html>";
	}

}
