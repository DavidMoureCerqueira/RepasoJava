package com.ejerciciosrepaso.Ejercicio2;
// Contar los números pares
public class ContarPares {
    public static void main(String[] args) {
       int[] numeros = {3, 4, 7, 10, 12, 15, 18};

        int contadorPares = 0;

        for(int numero:numeros){
            if(numero%2==0) contadorPares++;
        }

        System.out.println("Cantidad de números pares: " + contadorPares);
    }
}