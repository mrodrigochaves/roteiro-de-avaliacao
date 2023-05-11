package dev.mrodrigochaves.roteiro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.mrodrigochaves.roteiro.model.Roteiro;
import dev.mrodrigochaves.roteiro.repository.RoteiroRepository;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/roteiro")
@AllArgsConstructor
public class RoteiroController {

    
    private RoteiroRepository roteiroRepository;
    


    @GetMapping
    public List<Roteiro> list() {
        return roteiroRepository.findAll();
    }

}
