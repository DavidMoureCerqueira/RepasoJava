package com.ejerciciosrepaso.Ejercicio11;

public class Coche extends Vehiculo{

    public Coche(String matricula, String color) {
        super(color, matricula);
    }
     public Coche(String matricula) {
        super( matricula);
    }

    @Override
    public String toString() {
        return String.format(matricula);
    }
    
    
    

   
    
}
