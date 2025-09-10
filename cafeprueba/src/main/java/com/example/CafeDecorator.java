package com.example;

public abstract class CafeDecorator implements Cafe{
    protected Cafe cafe;

    public CafeDecorator (Cafe cafe){

        this.cafe=cafe;
        
    }

    @Override
    public double coste(){
        return cafe.coste();
    }
}
