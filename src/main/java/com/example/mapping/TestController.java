package com.example.mapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/{name}/{profile}/{label}/**")
	public String noparam() {
		return "noparam";
	}

	@RequestMapping(value = "/{name}/{profile}/**", params = "useDefaultLabel")
	public String param() {
		return "param";
	}
	
}
