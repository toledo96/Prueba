package com.prueba.prueba.service;

import com.prueba.prueba.entities.Consultorio;
import com.prueba.prueba.repository.ConsultorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultorioServiceImpl implements ConsultorioService{

    @Autowired
    private ConsultorioRepository consultorioRepository;
    @Override
    public List<Consultorio> listarConsultorios() {
        return consultorioRepository.findAll();
    }
}
