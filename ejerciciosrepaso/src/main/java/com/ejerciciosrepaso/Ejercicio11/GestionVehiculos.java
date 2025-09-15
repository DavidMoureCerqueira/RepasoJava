package com.ejerciciosrepaso.Ejercicio11;

import java.util.HashMap;

public class GestionVehiculos {
    private HashMap<String,Vehiculo> coleccion;

    public GestionVehiculos(){
        coleccion=new HashMap();

    }

    public void añadir(String matricula, Vehiculo vehiculo){
        coleccion.putIfAbsent(matricula, vehiculo);
    }

    public void retirar(String matricula, Vehiculo vehiculo){
        coleccion.remove(matricula, vehiculo);
    }

    public void visualizar(){
        System.out.println(coleccion.toString());
        
    }
    public void buscar(String matricula){
        if(coleccion.containsKey(matricula)){
           
        }
    }
}
