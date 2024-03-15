package zad6;

public class Pracownik {
    String zawod;
    Pracowac pracowac;
    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    Dojezdzac dojezdzac;

    public Pracownik(){};

    public Pracownik(String zawod, Pracowac pracowac, SpedzanieWolnegoCzasu spedzanieWolnegoCzasu, Dojezdzac dojezdzac) {
        this.zawod = zawod;
        this.pracowac = pracowac;
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
        this.dojezdzac = dojezdzac;
    }

    public void dojezdzac() {
        dojezdzac.dojezdzac();
    }

    public void pracowac() {
        pracowac.pracowac();
    }

    public void spedzanieWolnegoCzasu() {
        spedzanieWolnegoCzasu.spedzanieWolnegoCzasu();
    }
}
