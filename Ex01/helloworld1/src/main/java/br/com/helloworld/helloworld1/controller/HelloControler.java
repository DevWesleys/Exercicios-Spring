package br.com.helloworld.helloworld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController   
@RequestMapping("/helloworld")
public class HelloControler {
		
	@GetMapping
		public String hello() {
			return "Persistência, Atenção aos Detalhes";
	}

}
