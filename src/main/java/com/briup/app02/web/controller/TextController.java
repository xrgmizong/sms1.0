package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TextController {
	@GetMapping("hello")
	public String hello() {
		return "hello world";
	}

	@GetMapping("o")
	public String o() {
		return "hello world";
	}

}
