package com.codingdojo.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("")
	public String coding(){
		return "¡Hola Coding Dojo!";
	}
	@RequestMapping("/python")
	public String codingPython() {
		return "¡Python/Django fue increíble!";
	}
	@RequestMapping("/java")
	public String codingJava() {
		return "¡Java/Spring es mejor!";
	}
}
