package com.prueba.prueba.repository;

import com.prueba.prueba.entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctoresRepository extends JpaRepository<Doctor,Integer> {
}
