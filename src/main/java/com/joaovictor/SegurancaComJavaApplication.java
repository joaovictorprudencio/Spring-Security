package com.joaovictor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SegurancaComJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegurancaComJavaApplication.class, args);
	}

}

@RestController
 class controller{

	@GetMapping("/publica")
	public  String RotaPublica(){
		return "<h1>  Rota publica <h1/>";
	}

   
	@GetMapping("/privada")
	public  String RotaPrivada(){
		return "<h1>  rota privada <h1/>";
	}

}