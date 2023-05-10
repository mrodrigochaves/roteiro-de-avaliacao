package dev.mrodrigochaves.roteiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.mrodrigochaves.roteiro.model.Roteiro;


@Repository
public interface RoteiroRepository extends JpaRepository<Roteiro, Long>{
    
}
