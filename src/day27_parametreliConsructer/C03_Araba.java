package day27_parametreliConsructer;

public class C03_Araba {
    String marka = "Marka belirtilmemis";
    String model = "Model belirilmemis";
    int yil = 1990;
    int fiyat;
    String renk = "Renk belirilmemis";

    C03_Araba() {

    }

    C03_Araba(String mrk, String mdl, int yl, int fy, String rnk) {
        marka = mrk ;
        model = mdl;
        yil = yl;
        fiyat = fy;
        renk = rnk;
    }


    @Override
    public String toString() {
        return "C03_Araba{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
