package com.prueba.prueba.service;

import com.prueba.prueba.entities.Doctor;
import com.prueba.prueba.repository.DoctoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctoresRepository doctoresRepository;

    @Override
    public List<Doctor> listarDoctores() {
        return doctoresRepository.findAll();
    }
}
