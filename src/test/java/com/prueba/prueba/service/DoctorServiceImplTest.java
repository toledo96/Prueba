package com.prueba.prueba.service;

import static org.junit.jupiter.api.Assertions.*;


import com.prueba.prueba.entities.Consultorio;
import com.prueba.prueba.entities.Doctor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class DoctorServiceImplTest {

    @Autowired
    private DoctorService doctorService;

    @Test
    public void obtenerDoctores(){
        List<Doctor> listaConsultorios = doctorService.listarDoctores();
        assertEquals(5,listaConsultorios.size());
    }

}