package com.uce.funciones;

public class CalculadoraIMC {
    

    // Para este metodo ingresamos la estatura de la persona en cm y su peso en libras
    // El metodo devuelve el IMC calculado
    public double calcularIMC(int peso, int estatura){
        //Convertir estatura de cm a metros
        double estaturaMetros = estatura / 100.0;
        //Convertir peso de libra a kilogramos
        double pesoKg = peso * 0.453592;
        //Calcular IMC
        double imc = pesoKg / (estaturaMetros * estaturaMetros);
        return imc;
    }

    // Para este metodo ingresamos la estatura de la persona en metros y su peso en kilogramos
    // El metodo devuelve el IMC calculado  
     public double calcularIMC(double peso, double estatura){
        //Calcular IMC
        int imc = (int) (peso / (estatura * estatura));
        return imc;
    }
}
