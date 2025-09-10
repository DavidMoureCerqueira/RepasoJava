package SimUDuckapp;

public class MallarDuck extends Duck{
    public MallarDuck(){
        flyBehaviour=new FlyWithWings();
        quackBehaviour=new Quack();
    }
    

    @Override
    public void display() {
        System.out.println("It looks like a MallarDuck");
    }

}
