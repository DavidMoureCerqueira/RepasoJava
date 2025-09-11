package com.ejerciciosrepaso.Ejercicio8;

public class CuentaBancaria {
    private final String titular;
    private Double saldo;
    
    public CuentaBancaria(String titular, Double saldo) {
        this.titular = titular;
        this.saldo=saldo;
    }
    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo=(double)saldo;
    }
    public void retirar(double cantidad){
        if(this.saldo-cantidad<0){
             System.out.println("No es posiblae retirar esa cantidad de dinero, SALDO INSUFICIENTE");
        }else{
            this.saldo-=cantidad;
        }
    }    

    public void depositar(double cantidad){
        this.saldo+=cantidad;
    }
    @Override
    public String toString(){
        return String.format("El titular de esta cuenta es %s y dispone de %.2f", titular, saldo);
    }

}
