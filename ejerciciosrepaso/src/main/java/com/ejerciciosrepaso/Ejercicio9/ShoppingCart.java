package com.ejerciciosrepaso.Ejercicio9;

public class ShoppingCart {
    private Product[] lista;

    public ShoppingCart( Product[] lista){
        this.lista=lista;
    }
    public int getAllPrices (){
        int total=0;
        for (Product item : this.lista) {
            total+=item.getPrecio();
        }
        return total;
    }
    public String getCarrito(){
        String carrito="El carrito consta de: ";
        for (Product item : lista) {
            if(item.equals(lista[lista.length-1])){
                carrito+=item.getNombre()+".";
                
            }else{
                carrito+=item.getNombre()+", ";
            }
        }
        return carrito;
    }
}
