package dev.mrodrigochaves.roteiro.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Roteiro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String name;

    @Column(length = 13, nullable = false)
    private String protocol;

    @Column(length = 9)
    private String cnae;

    @Column(length = 200)
    private String description;

    @Column(length = 12)
    private String degree;

    @Column(length = 12)
    private String activity;
    


}