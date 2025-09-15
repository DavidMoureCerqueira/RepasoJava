package com.ejerciciosrepaso.Ejercicio11;

public class Vehiculo {
    protected String matricula;
    protected String color;
    protected int velocidad;

    public Vehiculo(String color, String matricula, int velocidad) {
        this.color = color;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }
    public Vehiculo(String matricula){
        this.matricula=matricula;
    }

    public Vehiculo(String color, String matricula) {
        this.color = color;
        this.matricula = matricula;
    }



    public int getVelocidad(){
        return velocidad;
    }
}
