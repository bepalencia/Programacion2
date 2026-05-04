package com.uce.objetos;

public class Persona {
    
    private String nombre;
    public String apellido;
    public int edad;
    public int dinero;

    
    
   
    public void setNombre(String nombre) {
        System.out.println("Hola, mi nombre ahora es " + nombre);
        this.nombre = nombre; //Variable local, se asigna a la variable de instancia
    }

    public void hablar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void decirEdad() {
        System.out.println("Tengo " + edad + " años");
    }




}
