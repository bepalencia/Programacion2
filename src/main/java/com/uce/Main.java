package com.uce;

import com.uce.funciones.Calculadora;
import com.uce.funciones.CalculadoraIMC;
import com.uce.funciones.ClaseEstatica;
import com.uce.funciones.Implementacion;
import com.uce.objetos.Alumno;
import com.uce.objetos.AlumnoInmutable;
import com.uce.objetos.AlumnoRecord;
import com.uce.objetos.Persona;

public class Main {
    public static void main(String[] args) {
        
    /*Implementacion classImplementacion = new Implementacion();
    classImplementacion.stop = 5;
    classImplementacion.factorial();
    System.out.println("El factorial de es "+classImplementacion.factorial);*/
 
    /*
    Persona juan = new Persona();
    juan.setNombre("Juan");
    juan.apellido = "Perez";
    juan.edad = 30;
    juan.dinero = 40;
    juan.hablar();

    juan.dinero =30;
    juan.setNombre("Carlos");
    juan.hablar();

    Persona pedro = new Persona();
    pedro.setNombre("Pedro");
    pedro.apellido = "Gomez";
    pedro.edad = 25;
    pedro.dinero = 30;
    pedro.hablar();

    pedro = juan;
    pedro.hablar();
    
    Persona mario = pedro; 
    mario.hablar();
    mario.setNombre("Mario");

    pedro.hablar();*/

    
    /* 
    Alumno alumno2 = new Alumno(1723203145,"Ana", 20, 170,154);
   

    CalculadoraIMC calculadora = new CalculadoraIMC();
    double imc = calculadora.calcularIMC(alumno2.getPeso(), alumno2.getEstatura());
    double imc2 = calculadora.calcularIMC(alumno2.getPeso(), alumno2.getEstatura());
    System.out.println("El IMC de " + alumno2.getNombre() + " con el primer métodos es: " + imc);
    System.out.println("El IMC de " + alumno2.getNombre() + " con el segundo método es: " + imc2);*/

    /*System.out.println(ClaseEstatica.atributoEstatico);
    ClaseEstatica.claseEstatica = new ClaseEstatica();
    claseEstatica.metodoEstatico();
    
    Book libro1 = new Book();
    
    System.out.println(ClaseEstatica.atributoEstatico);*/
   
   /*  Calculadora s1 = new Calculadora();

    System.out.println(s1.sumar(5, 3));
    System.out.println(s1.restar(5, 3));
    System.out.println(s1.multiplicar(5, 3));
    System.out.println(s1.dividir(5, 3));
    System.out.println(s1.factorial(5));*/

    AlumnoInmutable alumnoInmutable = new AlumnoInmutable(
        1723203145,
        "Ana", 
        20, 
        170,
        154);

    System.out.println(alumnoInmutable.getNombre());

    AlumnoRecord alumnoRecord1 = new AlumnoRecord(
        1723203145,
        "Ana", 
        20, 
        170,
        154);

    System.out.println(alumnoRecord1.nombre());

    AlumnoRecord alumnoRecord2 = new AlumnoRecord(
        alumnoRecord1.ci(),
        "Ana Maria", 
        alumnoRecord1.edad(), 
        alumnoRecord1.estatura(),
        alumnoRecord1.peso());


   


    
    
    

 }
 
}


