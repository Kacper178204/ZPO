package zad3;

public class Car {
    double maxSpeed;
    String carName;

    //konstruktor
    public Car(String carName, double maxSpeed)
    {
        this.maxSpeed = maxSpeed;
        this.carName = carName;
    }

    public void getMaxSpeed()
    {
        System.out.println(this.maxSpeed);;
    }

    public void showCarName()
    {
        System.out.println(this.carName);
    }
}
