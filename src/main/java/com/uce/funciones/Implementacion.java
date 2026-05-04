package com.uce.funciones;

public class Implementacion {


    public int stop = 0;
    public int factorial = 1;//Variable de instancia, se mantiene su valor a lo largo de la vida del objeto 

    public  void factorial() {
        
        for (int i = 2; i <= stop; i++) {
            factorial *= i;
        }
        
    }
}
