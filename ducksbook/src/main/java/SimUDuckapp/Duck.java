package SimUDuckapp;
abstract class Duck {
    protected FlyingBehaviour flyBehaviour ;
    protected QuackBehaviour quackBehaviour;
    

    public void swim(){
    System.out.println("All ducks float!");
    }

    public void performFly(){

    flyBehaviour.fly();
    
    }

    public void performQuack(){

    quackBehaviour.quack();

    }

    abstract void display();

    public void setFlyBehaviour(FlyingBehaviour fb){
        this.flyBehaviour=fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        this.quackBehaviour=qb;
    }


}
