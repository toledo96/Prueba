package com.prueba.prueba.repository;

import com.prueba.prueba.entities.Cita;
import com.prueba.prueba.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita,Integer> {
    public Cita findByhorarioConsulta(LocalDate date);
    public List<Cita> findByDoctor(String nombre);
}
