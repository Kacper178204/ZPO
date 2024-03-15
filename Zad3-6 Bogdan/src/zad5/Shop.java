package zad5;

public abstract class Shop {
    // abstrakcyjna klasa glowna tak samo jak w symulatorze kaczek

    String shopName;
    TaxRate taxRate;

    //pusty konstruktor
    public Shop(){};

    //konstruktor przypisujacy nazwe i wysokosc podatku
    public Shop(String shopName, TaxRate taxRate) {
        this.shopName = shopName;
        this.taxRate = taxRate;
    }
    //ustawienie wysokosci podatku
    public void setTaxRate(TaxRate taxRate) {
        this.taxRate = taxRate;
    }

    //Wyswietlenie informacji o sklepie
    public void showShopInfo() {
        System.out.println("Nazwa sklepu: " + this.shopName);
        taxRate.showTaxRate();
    }

}
