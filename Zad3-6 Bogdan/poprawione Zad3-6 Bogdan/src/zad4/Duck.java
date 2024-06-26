package zad4;

public abstract class Duck {
    FlyingBehavior flyingBehavior;
    QuackBehavior quackBehavior;

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {

        this.quackBehavior = quackBehavior;
    }

    public Duck(){}
    public Duck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        this.flyingBehavior = flyingBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("zad4.Duck is swimming");
    }
    public void performFly(){
        flyingBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

}
