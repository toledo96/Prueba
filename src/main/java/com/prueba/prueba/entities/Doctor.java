package com.prueba.prueba.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "doctores")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Se requiere el nombre")
    private String nombre;

    @NotBlank(message = "Se requiere el apellido paterno")
    private String apellidoPaterno;

    @NotBlank(message = "Se requiere el apellido materno")
    private String apellidoMaterno;

    @NotBlank(message = "Se requiere la especialidad")
    private String Especialidad;

    @OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Cita>  citas = new ArrayList<>();
}
