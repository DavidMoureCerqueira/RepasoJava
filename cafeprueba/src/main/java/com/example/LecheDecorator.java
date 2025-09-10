package com.example;

public class LecheDecorator extends CafeDecorator{

    public LecheDecorator(Cafe cafe) {
        
        super(cafe);

    }

    @Override
    public double coste(){
    
        return super.coste()+2;
    
    }
}
