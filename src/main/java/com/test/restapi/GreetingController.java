package com.test.restapi;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	//Usage http://localhost:8080/greeting/greet?name=Ahmed
	@GetMapping("/greet")
	public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
		logger.info("This is Greeting number {}", counter.get()+1);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
	
}
