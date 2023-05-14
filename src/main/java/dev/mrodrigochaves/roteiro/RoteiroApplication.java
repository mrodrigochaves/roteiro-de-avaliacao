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
	CommandLineRunner initDataBase( RoteiroRepository roteirosRepository){
		return args -> {
			roteirosRepository.deleteAll();

			Roteiro r = new Roteiro();
			r.setName("HIGHTECH SERVICOS LTDA");
			r.setProtocol("0021215456");
			r.setCnae("6203-1/00");
			r.setDescription("Desenvolvimento e licenciamento de programas de computador");
			r.setDegree("Baixo Risco");
			r.setActivity("Não");
			roteirosRepository.save(r);
		};
	}

}
