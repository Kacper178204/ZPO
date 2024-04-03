package zad5;

public class NiemieckiPodatek implements Podatek{
    double wartoscPodatku = 0.19;

    public double policzPodatek(double cena){
        return cena * wartoscPodatku;
    }
}
