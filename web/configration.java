package com.springbot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class configration {

	@RequestMapping("/hello")
	public String hello() {
	return "hello word";
	}

}
