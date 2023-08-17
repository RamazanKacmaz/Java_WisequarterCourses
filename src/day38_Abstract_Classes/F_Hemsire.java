package day38_Abstract_Classes;

public abstract class F_Hemsire extends D_Personel {


    public abstract void sertifika();
    public abstract void nöbet();

    @Override
    public void standartMaas() {
        System.out.println("Tum hemsiler icin standat maas 20.000 TL");
    }
}
