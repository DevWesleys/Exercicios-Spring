package br.com.helloworld.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController   
@RequestMapping("/helloworld")
public class Hello2Controler {
		
	@GetMapping
		public String hello() {
			return "Estudar mais a fundo a lógica e aprofundar no Spring  ";
	}

}
