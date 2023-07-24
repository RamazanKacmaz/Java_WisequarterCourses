package day27_parametreliConsructer;

public class C05_araba {
    String marka = "Marka belirtilmemis";
    String model = "Model belirilmemis";
    int yil = 1990;
    int fiyat;
    String renk = "Renk belirilmemis";


    public C05_araba() {
    }

    public C05_araba(String marka, String model, int yil, int fiyat, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        this.renk = renk;
    }

    public C05_araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public C05_araba(int fiyat, String renk) {
        this.fiyat = fiyat;
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "C05_araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
