package com.dio.live.repository;

import com.dio.live.model.jornadaTrabalho;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<jornadaTrabalho, Long> {   
}
