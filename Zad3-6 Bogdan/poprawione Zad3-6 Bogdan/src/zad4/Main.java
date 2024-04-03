package zad4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Duck> kaczki = new ArrayList<Duck>();
        kaczki.add(new MalladDuck(new FlyingWithWings(),new Quack()));
        kaczki.add(new RubberDuck(new FlyingNoWay(),new Squack()));
        kaczki.add(new ModelDuck(new FlyingNoWay(),new MuteQuack()));

        for(Duck duck:kaczki){
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }
        kaczki.get(1).setFlyingBehavior(new FlyingBehavior() {
            @Override
            public void fly() {
                System.out.println("zad4.Duck is flying with a rocket");
            }
        });
        kaczki.get(1).performFly();

    }
}
