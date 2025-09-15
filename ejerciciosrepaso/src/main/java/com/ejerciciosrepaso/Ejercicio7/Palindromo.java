package com.ejerciciosrepaso.Ejercicio7;
class Coche {
    private String marca;
    private int velocidad;



    public Coche(String marca){
        this.marca=marca;
        this.velocidad=0;
    }

    public void acelerar(int incremento){
        this.velocidad+=incremento;
    }
    public void frenar (int decremento){
        if(this.velocidad-decremento<0){
            System.out.println("No es posible frenar tanto el coche!!");
        }
        else{
            this.velocidad-=decremento;
        }
    }
    @Override
    public String toString(){
        return String.format("El coche de la marca %s va a una velocidad de %d km/h %n", this.marca, this.velocidad);
    }
}

