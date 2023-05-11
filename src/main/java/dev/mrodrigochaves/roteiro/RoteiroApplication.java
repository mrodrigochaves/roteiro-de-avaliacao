package dev.mrodrigochaves.roteiro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.mrodrigochaves.roteiro.model.Roteiro;
import dev.mrodrigochaves.roteiro.repository.RoteiroRepository;

@SpringBootApplication

public class RoteiroApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RoteiroApplication.class, args);
		
		
	}

	@Bean
	CommandLineRunner initDataBase(RoteiroRepository roteiroRepository){
		return args -> {
			roteiroRepository.deleteAll();

			Roteiro r = new Roteiro();
			r.setName("Design dos Reis Ensino");
			r.setProtocol("0001215454478");

			roteiroRepository.save(r);
		}; 
	}

}
