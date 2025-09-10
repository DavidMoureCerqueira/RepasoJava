package com.example;

public class ChocolateDecorator extends CafeDecorator{

    public ChocolateDecorator (Cafe cafe){

        super(cafe);
        
    }

    @Override
    public double coste(){

    return super.coste()+3.0;

    }
}
