package dev.mrodrigochaves.roteiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping("/")
public class RoteiroApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RoteiroApplication.class, args);
		
		
	}

	@GetMapping("/home")
	public String apiHome(){
		return "Olá, seja bem-vindo!";
	}

}
