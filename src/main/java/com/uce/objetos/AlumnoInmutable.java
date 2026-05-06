package com.uce.objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public final class AlumnoInmutable {

     //Atributos
    
    @Getter
    private final int ci;
    @Getter
    private final String nombre;
    @Getter
    private final int edad;
    @Getter
    private final int estatura;
    @Getter
    private final int peso;

   
}
