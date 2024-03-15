package zad5;

import java.util.ArrayList;

public class MainSklep {
    public static void main(String[] args) {
        ArrayList<Shop> shops = new ArrayList<Shop>();
        shops.add(new Polska("Stonka", new PolskiPodatek()));
        shops.add(new Niemcy("DEUTSCHE", new NiemieckiPodatek()));
        shops.add(new WlkBrytania("Fish&Chips", new WlkBrytaniaPodatek()));

        for(Shop shop:shops) {
            shop.showShopInfo();
            System.out.println();
        }
    }
}
