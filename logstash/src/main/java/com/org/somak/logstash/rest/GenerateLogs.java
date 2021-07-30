package com.org.somak.logstash.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GenerateLogs {

	
	@GetMapping("/generate")
	@ResponseStatus(HttpStatus.OK)
	public String getMeSomeStats() {
	
		for(int i=0; i<10;i++) {
		
			log.info("I generated messages in info mode==========================================");
			log.debug("I generated messages in debug mode=======================================");
			log.trace("I generated messages in trace mode=====================================");
			log.error("i generated messages in error mode===================================");
		}
		
		
		return "i am generating logs tra lalalalalala";
	}
}
