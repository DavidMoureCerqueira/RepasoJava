package com.ejerciciosrepaso.Ejercicio10;

public class Main {
 public static void main(String[] args) throws Exception {
    Coche c = new Coche("B7399XF", "Naranja", 23);
    c.acelerar(15);
    c.acelerar(40);
    c.reducir(5);
    c.frenar();
    Moto m = new Moto("6468GTL", "Amarillo", 43);
    m.acelerar(25);
    m.acelerar(60);
    m.reducir(20);
    m.frenar();
}
    
  
}

