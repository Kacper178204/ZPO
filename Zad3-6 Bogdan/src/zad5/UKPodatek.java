package zad5;

public class UKPodatek implements Podatek{
    double wartoscPodatku = 0.20;

    public double policzPodatek(double cena){
        return cena * wartoscPodatku;
    }
}
