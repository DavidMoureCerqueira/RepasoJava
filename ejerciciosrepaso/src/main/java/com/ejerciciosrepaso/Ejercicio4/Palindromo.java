package com.ejerciciosrepaso.Ejercicio4;


public class Palindromo {
    public static void main(String[] args) {
        String palabra = "Reconocer";
        palabra=palabra.replaceAll("\\s+","").toLowerCase();
        boolean esPalindromo = true;
        
        // StringBuilder sb= new StringBuilder(palabra);
        // String palabra2=sb.reverse().toString();




        for (int posIni = 0; posIni < palabra.length()/2; posIni++) {
            int posFin=palabra.length()-1-posIni;
            if(palabra.charAt(posIni)!=(palabra.charAt(posFin))){
                esPalindromo=false;
                break;
            }
            
        }

        if (esPalindromo) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }
}