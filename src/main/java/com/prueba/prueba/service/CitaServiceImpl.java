package com.prueba.prueba.service;

import com.prueba.prueba.entities.Consultorio;
import com.prueba.prueba.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CitaServiceImpl implements CitaService{
    @Autowired
    private CitaRepository citaRepository;


}
