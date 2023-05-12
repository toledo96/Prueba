package com.prueba.prueba.controller;


import com.prueba.prueba.service.ConsultorioService;
import com.prueba.prueba.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalController {
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private ConsultorioService consultorioService;


    @GetMapping({"/principal","/"})
    public String index(Model modelo){
        modelo.addAttribute("doctores",doctorService.listarDoctores());
        modelo.addAttribute("consultorios",consultorioService.listarConsultorios());
        return "principal";
    }


}
