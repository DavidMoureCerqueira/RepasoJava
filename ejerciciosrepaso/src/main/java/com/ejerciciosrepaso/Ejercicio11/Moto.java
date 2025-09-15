package com.ejerciciosrepaso.Ejercicio11;

public class Moto extends Vehiculo{

    
    public Moto(String matricula, String color) {
        super(color, matricula);
    }
    public Moto(String matricula) {
        super( matricula);
    }

    @Override
    public String toString() {
        return String.format(matricula);
    }
    
}

