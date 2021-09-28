package com.jona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/saludar")
	public String saludar() {
		return "Hola mundo";
	}
}
