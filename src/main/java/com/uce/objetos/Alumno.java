package com.uce.objetos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    
    //Atributos
    @Getter
    private int ci;

    @Getter @Setter
    private String nombre;

    @Getter @Setter
    private int edad;

    @Getter @Setter
    private int estatura;

    @Getter @Setter
    private int peso;

    //Constructores
    


    
    //Getters y Setters
  
    
    //Métodos
    // Responsabilidad unica, el objeto es responsable de convertir sus atributos 
    // a las unidades necesarias para el calculo del IMC 

    public double estaturaEnMetros(){
        return this.estatura / 100.0;
    }

    public double pesoEnKg(){
        return this.peso * 0.453592;
    }


}
