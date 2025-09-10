package SimUDuckapp;

public class Main {
    public static void main(String[] args) {
        Duck pato= new MallarDuck();

        pato.display();

        pato.performFly();

        pato.performQuack();

        pato.setFlyBehaviour(new FlyWithRockets());

        pato.performFly();

        pato.setQuackBehaviour(new Squeak());

        pato.performQuack();


    }
}