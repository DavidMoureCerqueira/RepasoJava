package com.ejerciciosrepaso.Ejercicio10;

public class Moto extends Vehiculo{

    
    public Moto(String matricula, String color, int velocidad) {
        super(color, matricula, velocidad);
    }

    @Override
    void acelerar(int incremento) {
        this.velocidad+=incremento;
        System.out.printf("La velocidad despues de incrementar %d km/h es de: \t %d", incremento, this.velocidad);
    }

    @Override
    void reducir(int decremento) {
        this.velocidad-=decremento;
        System.out.printf("La velocidad despues de decrementar %d km/h es de: \t %d\n", decremento, this.velocidad);
    }

    @Override
    void frenar() {
        System.out.println("Velocidad inicial:"+this.velocidad);
       while(this.velocidad>0){
            this.velocidad-=5;

            if(this.velocidad<5){
                this.velocidad=0;
            }
            System.out.println("La velocidad está decrementando de 10 en 10, y ahora mismo es de: \n"+this.velocidad);
       }
    }
    
}

