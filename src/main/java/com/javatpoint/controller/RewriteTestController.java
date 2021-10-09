package com.javatpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RewriteTestController {
	
	@GetMapping("/rewrite")
	public String getIndex() {
		return "<html><h1>This is Original page for rewrite</h1></html>";
	}
	
	@GetMapping("/keyauth")
	public String getKeyAuth() {
		return "<html><h1>Key Auth is Successful</h1></html>";
	}
}
