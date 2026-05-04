package com.uce.funciones;

public class Calculadora {

        private final double pi = 3.1416;
        private final double e = 2.7183;
    
        public static double sumar(double a, double b){
        return a + b;
        }   

        public static double restar(double a, double b){
            return a - b;
        }   
    
        public static double multiplicar(double a, double b){
            return a * b;
        }   
    
        public static double dividir(double a, double b){
            if(b == 0){
                System.out.println("No se puede dividir por cero");
                return 0;
            }
            return  a / b;
        }

        public  static int factorial(int n){
            int resultado = 1;
            for(int i = 1; i <= n; i++){
                resultado *= i;
            }
            return resultado;
        }


      

}
