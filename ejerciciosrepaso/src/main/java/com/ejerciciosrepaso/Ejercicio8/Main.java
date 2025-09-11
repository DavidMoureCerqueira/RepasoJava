package com.ejerciciosrepaso.Ejercicio8;

// Crea una clase CuentaBancaria con atributos titular y saldo.

// Implementa un método depositar(double cantidad) que aumente el saldo.

// Implementa un método retirar(double cantidad) que reste el saldo si
//  hay dinero suficiente (que muestre un mensaje por pantalla en caso contrario)
public class Main{
   
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Ana", 1000);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println(cuenta);
    }

}