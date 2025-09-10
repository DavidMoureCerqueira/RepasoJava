package com.ejerciciosrepaso.Ejercicio3;

import java.util.Arrays;

// Escribe un programa que invierta un array de enteros.

public class InvertirArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
       
        // al final debería imprimirse: 5 4 3 2 1

        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        int tempoVar;
        for (int posIni = 0; posIni < numeros.length/2; posIni++) {
            int posFin=numeros.length-1-posIni;
            tempoVar=numeros[posIni];
            numeros[posIni]=numeros[posFin];
            numeros[posFin]=tempoVar;
        }
        System.out.println("Array invertido " + Arrays.toString(numeros));
    }
}