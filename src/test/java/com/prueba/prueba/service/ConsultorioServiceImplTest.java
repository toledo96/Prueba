package com.prueba.prueba.service;

import com.prueba.prueba.entities.Consultorio;
import com.prueba.prueba.repository.ConsultorioRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConsultorioServiceImplTest {

    @Autowired
    private ConsultorioService consultorioService;

    @Autowired
    private ConsultorioRepository consultorioRepository;

    @Test
    public void obtenerConsultorios(){
        List<Consultorio> listaConsultorios = consultorioService.listarConsultorios();
        assertEquals(5,listaConsultorios.size());
    }

}