package com.example;

public class Main {
    public static void main(String[] args) {
        Cafe miCafe=new CafeSimple();
        System.out.println("Precio cafe solo= " + miCafe.coste());
        miCafe=new LecheDecorator(miCafe);
        System.out.println("Precio cafe con leche= " + miCafe.coste());
        miCafe=new ChocolateDecorator(miCafe);
        System.out.println("precio total= " + miCafe.coste());
    }
}