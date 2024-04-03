package zad5;

public class MainPodatek {
    public static void main(String[] args) {
        KalkulatorPodatku kalkulator = new KalkulatorPodatku(new PolskiPodatek());
        System.out.println(kalkulator.policzPodatek(2137.45));

        kalkulator.setPodatek(new NiemieckiPodatek());
        System.out.println(kalkulator.policzPodatek(420.99));

        kalkulator.setPodatek(new UKPodatek());
        System.out.println(kalkulator.policzPodatek(1010.59));
    }
}
