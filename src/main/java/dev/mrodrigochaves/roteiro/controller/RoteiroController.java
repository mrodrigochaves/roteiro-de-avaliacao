package dev.mrodrigochaves.roteiro.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class RoteiroController {
    
    @GetMapping
    public List<Object> list() {
        return null;
    }

}
