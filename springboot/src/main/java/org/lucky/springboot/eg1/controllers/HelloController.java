package org.lucky.springboot.eg1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * using Spring mvc annotations gets scanned at startup
 * invoke using http://localhost:8080/eg1/hi
 *
 */
@RestController()
@RequestMapping("/eg1")
public class HelloController {

	@RequestMapping("/hi")
	public String get(){
		return "hi!!";
	}
}
