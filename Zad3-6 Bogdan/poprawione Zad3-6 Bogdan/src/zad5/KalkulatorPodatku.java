package zad5;

public class KalkulatorPodatku {
    private Podatek podatek;

    public KalkulatorPodatku(Podatek podatek){
        this.podatek=podatek;
    }

    public void setPodatek(Podatek podatek){
        this.podatek = podatek;
    }

    public double policzPodatek(double cena){
        return podatek.policzPodatek(cena);
    }

}
