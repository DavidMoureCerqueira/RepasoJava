package com.ejerciciosrepaso.Ejercicio6;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10; // primeros 10 números

        int num1=0;
        int num2=1;
        int contador=1;
        System.out.printf("Los primeros %d numero de fibonacci son:", n);
        while(contador<=n){
            int temp;
            temp=num1;
            num1=num2+temp;
            num2=temp;
            System.out.println(temp);
            contador++;
        }
    }
}
