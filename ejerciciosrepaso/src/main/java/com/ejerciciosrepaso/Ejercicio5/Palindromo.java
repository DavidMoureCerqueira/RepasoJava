package com.ejerciciosrepaso.Ejercicio5;

public class Primos {
    public static void main(String[] args) {
        int limite = 50;

        System.out.println("Los numeros primos son:");
        for (int i = 2; i <= limite; i++) {
            if(esPrimo(i)){
                
                     System.out.print(" "+i);
            }
        }
    }

    public static boolean esPrimo(int numero) {

        for (int i=2;i<numero ;i++ ) {
                if(i numero%i==0){
                    return false;
                }
            }
        return true;
        }
       
}