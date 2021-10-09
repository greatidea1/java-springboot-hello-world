package com.javatpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@RestController
@RequestMapping("/api4")
public class HelloController {

	@GetMapping("/greetings")
	public String sayHello() {
		return "Hello greetings from the micro service1";
	}
	
	@GetMapping("/headers")
	public String getHeaders(HttpServletRequest req) {
		Enumeration<String> headers = req.getHeaderNames();
		

		
		StringBuilder builder = new StringBuilder();
		
		while(headers.hasMoreElements()) {
			String header = headers.nextElement();
			builder.append(header +" : ");
			builder.append(req.getHeader(header) + "<br>");
		}
		return builder.toString();
	}
	
	@GetMapping("/cors")
	public String getCors(HttpServletRequest req) {
		Enumeration<String> headers = req.getHeaderNames();
		

		StringBuilder builder = new StringBuilder();
		
		while(headers.hasMoreElements()) {
			String header = headers.nextElement();
			builder.append(header +" : ");
			builder.append(req.getHeader(header) + "<br>");
		}
		builder.append("<br>This endpoint is cors enabled");
		return builder.toString();
	}
	
	@GetMapping("/limit")
	public String getLimit() {
		return "This endpoint limited to 2 requests";
	}
	
	@GetMapping("/serverless")
	public String getServerless() {
		return "This endpoint is for serverless testing";
	}

	@GetMapping("/dashboard")
	public String getDashboard() {
		return "This endpoint is for dashboard testing";
	}

	@GetMapping("/echo")
	public String getEcho() {
		return "\nThis endpoint is for echo plugin testing";
	}

	@GetMapping("/echo2")
	public String getEcho2() {
		return "\nThis endpoint is for echo 2 plugin testing";
	}

	@GetMapping("/realip")
	public String getRealIP() {
		return "This endpoint is for real ip plugin testing";
	}

	@GetMapping("/faultinjection")
	public String getFaultinjection() {
		return "This endpoint is for fault injection plugin testing";
	}

	@GetMapping("/corscheck")
	public String getCorsCheck() {
		return "This endpoint is for cors plugin testing";
	}

	@GetMapping("/trafficsplit")
	public String getTrafficSplit() {
		return "This endpoint is for traffic split  plugin testing. Version 1";
	}

	@GetMapping("/correlationid")
	public String getCorrelationid(HttpServletRequest req) {
		Enumeration<String> headers = req.getHeaderNames();
		StringBuilder builder = new StringBuilder();

		while(headers.hasMoreElements()) {
			String header = headers.nextElement();
			builder.append(header +" : ");
			builder.append(req.getHeader(header) + "<br>");
		}
		builder.append("<br>This endpoint is request id i.e correlation id enabled");
		return builder.toString();
	}

	@PostMapping("/upload")
	public String getTrafficSplit(String data) {
		return "This endpoint is for client control plugin testing";
	}

	@GetMapping("/breaker")
	public String getBreaker() {
		//throw new RuntimeException("something went wrong");
		return "This endpoint is for breaker plugin testing.";
	}

	@GetMapping("/healthcheck")
	public String getHealthcheck() {
		return "This endpoint is for health check. version 1";
	}

	@GetMapping("/eurekaRegistry")
	public String getEurekaRegistry() {
		return "This endpoint is for eureka registry. version 1";
	}

	@GetMapping("/proxyrewrite")
	public String getProxyrewrite() {
		return "This endpoint is for proxy rewrite";
	}

	@GetMapping("/testssl")
	public String getTestSSl() {
		return "This endpoint is for test SSL";
	}


	@GetMapping("/prometheus")
	public String getPrometheus() {
		return "This endpoint is for prometheus. version 2";
	}
}
