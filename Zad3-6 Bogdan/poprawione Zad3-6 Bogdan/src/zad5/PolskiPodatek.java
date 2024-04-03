package zad5;

public class PolskiPodatek implements Podatek{
    double wartoscPodatku = 0.23;

    public double policzPodatek(double cena){
        return cena * wartoscPodatku;
    }
}
