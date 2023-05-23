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

    /**
     * Endpoint para obter todos os roteiros.
     *
     * @return Lista de roteiros
     */
    @GetMapping
    public @ResponseBody List<Roteiro> listar() {
        return roteirosRepository.findAll();
    }

    /**
     * Endpoint para obter um roteiro específico pelo seu ID.
     *
     * @param id O ID do roteiro a ser obtido
     * @return ResponseEntity contendo o roteiro, se encontrado, ou status de não encontrado caso contrário
     */
    @GetMapping("/{id}")
    public ResponseEntity<Roteiro> encontrarPorId(@PathVariable Long id) {
        return roteirosRepository.findById(id)
                .map(registro -> ResponseEntity.ok().body(registro))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Endpoint para criar um novo roteiro.
     *
     * @param roteiro O objeto roteiro a ser criado
     * @return O objeto roteiro criado
     */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Roteiro criar(@RequestBody Roteiro roteiro) {
        return roteirosRepository.save(roteiro);
    }

}
