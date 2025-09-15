package com.ejerciciosrepaso.Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota");
        coche.acelerar(50);
        coche.frenar(20);
        System.out.println(coche);
    }
}