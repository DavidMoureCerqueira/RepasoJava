package com.ejerciciosrepaso.Ejercicio1;

// Escribir todos los números del 100 al 0 de 7 en 7.
public class Main {
    public static void main(String[] args) {
        int numero=100;

        while(numero>=0){
            System.out.println(numero);
            numero-=7;
        }   
    }
}