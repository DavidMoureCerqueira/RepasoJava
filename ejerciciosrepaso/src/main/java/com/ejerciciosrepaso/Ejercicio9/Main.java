package com.ejerciciosrepaso.Ejercicio9;

public class Main {
    public static void main(String[] args) {
       
        Product tomate=new Product("tomate", 2);
        Product pera=new Product("pera", 2);
        Product manzana=new Product("manzana", 2);
        Product almendras=new Product("almendras", 2);
        Product sal=new Product("sal", 2);
        Product [] productos={tomate,pera,manzana,almendras,sal};
        ShoppingCart carrito=new ShoppingCart(productos);
        System.out.println(carrito.getCarrito());
        System.out.println("Total: " + carrito.getAllPrices() + "€");
    }
    
  
}
