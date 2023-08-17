package day38_Abstract_Classes;

public class E_Doktor extends D_Personel{


    @Override
    public void standartMaas() {
        System.out.println("Doktrlar icin satandart maas 30.000 TL");
    }

    @Override
    public void mesai() {
        System.out.println("Doktorlar haftada 5 gun 6 saat mesai yapar");
    }

    @Override
    public void yillikIzin() {
        System.out.println("Doktolarin yillik 1 ay izni olur");
    }

    @Override
    public void ozelSigorta() {
        System.out.println("Doktolar 1000 tl ktki ile guvenöik sigorasu yapabilir.");
    }
}
