package zad3;

public abstract class Car {
    SpeedBehavior speedBehavior;
    NameBehavior nameBehavior;


    public void setSpeedBehavior(SpeedBehavior speedBehavior)
    {
       this.speedBehavior = speedBehavior;
    }

    public void setNameBehavior(NameBehavior nameBehavior)
    {
        this.nameBehavior = nameBehavior;
    }

    //konstruktor
    public Car() {}
    public Car(NameBehavior nameBehavior, SpeedBehavior speedBehavior)
    {
        this.nameBehavior = nameBehavior;
        this.speedBehavior = speedBehavior;
    }

    //metody pokazywania danych
    public void showSpeedBehavior()
    {
        speedBehavior.speed();
    }
    public void showNameBehavior()
    {
        nameBehavior.name();
    }
}
