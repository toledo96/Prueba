package com.prueba.prueba.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NoSpaceException extends RuntimeException{

    private String tipo;
    private String mensaje;


}
