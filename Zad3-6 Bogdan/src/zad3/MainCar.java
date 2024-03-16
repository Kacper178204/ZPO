package zad3;

import java.util.ArrayList;

public class MainCar {
    public static void main(String[] args) {
        ArrayList<Car> samochody = new ArrayList<Car>();
        samochody.add(new Polski_126p(new Fiat(), new Slow()));
        samochody.add(new sf90(new Ferrari(), new VeryFast()));
        samochody.add(new Auris(new Toyota(), new Fast()));


        for (Car car : samochody) {
            car.showSpeedBehavior();
            car.showNameBehavior();
            System.out.println();
        }


    }
}
