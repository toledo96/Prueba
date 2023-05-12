package com.prueba.prueba.entities;
import lombok.*;

import javax.persistence.*;
import java.time.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "consultorio_id",referencedColumnName = "id")
    private Consultorio consultorio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id",referencedColumnName = "id")
    private Doctor doctor;

    private LocalDate horarioConsulta;

    private String nombrePaciente;



}