package day26_forEachLoop_constructor;

public class C08_Car {

    String marka = "Marka belirtilmemis";
    String model = "Model belirilmemis" ;

    int yil = 1990 ;
     int fiyat;
     String renk = "Renk belirilmemis";


    @Override
    public String toString() {
        return "C08_Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                '}';
    }
}
