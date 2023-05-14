package dev.mrodrigochaves.roteiro.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.mrodrigochaves.roteiro.model.Roteiro;
import dev.mrodrigochaves.roteiro.repository.RoteiroRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/roteiro")
@AllArgsConstructor

public class RoteiroController {

    
    private RoteiroRepository roteirosRepository;


    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public @ResponseBody List<Roteiro> list(){
        return roteirosRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Roteiro> findById(@PathVariable Long id){
        return roteirosRepository.findById(id)
        .map(record -> ResponseEntity.ok().body(record))
        .orElse(ResponseEntity.notFound().build());
    } 

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED )
    public Roteiro create(@RequestBody Roteiro roteiro ) {
        return roteirosRepository.save(roteiro);
              
    }
    
}