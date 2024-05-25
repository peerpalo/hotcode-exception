package com.test.code.builder.api;

import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class TestController {
	@GetMapping("/api/test")
	@ResponseStatus(value = HttpStatus.OK)
	public ModelMap test(HttpServletRequest req) {
		return new ModelMap();
	}
}
