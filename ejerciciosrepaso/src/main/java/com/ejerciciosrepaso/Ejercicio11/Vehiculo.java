package com.ejerciciosrepaso.Ejercicio11;

abstract class Vehiculo {
    protected String matricula;
    protected String color;
    protected int velocidad;

    public Vehiculo(String color, String matricula, int velocidad) {
        this.color = color;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public Vehiculo(String color, String matricula) {
        this.color = color;
        this.matricula = matricula;
    }

    abstract void acelerar(int incremento);

    abstract void reducir(int decremento);

    abstract void frenar();

    public int getVelocidad(){
        return velocidad;
    }
}
