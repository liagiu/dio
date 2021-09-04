package com.dio.live.service;

import com.dio.live.model.jornadaTrabalho;
import com.dio.live.repository.JornadaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {
    
    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    public jornadaTrabalho saveJornada(jornadaTrabalho jornadatrabalho){
        return jornadaRepository.save(jornadatrabalho);
     }

    public List<jornadaTrabalho> findAll() {
        return jornadaRepository.findAll();
    }

    public Optional<jornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public jornadaTrabalho updateJornada(jornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
