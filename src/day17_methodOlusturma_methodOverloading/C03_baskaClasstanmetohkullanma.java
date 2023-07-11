package day17_methodOlusturma_methodOverloading;

import day16_metodOlusturma_kullanma.C01_metodOlusturma;
import day16_metodOlusturma_kullanma.C03_MethodOlusturma;

public class C03_baskaClasstanmetohkullanma {
    public static void main(String[] args) {
        C01_metodOlusturma.altString("Method budur..", 7,8);
        System.out.println(C03_MethodOlusturma.isimDuzenle("omer", "gök."));

        System.out.println(C01_AsalSayiBulma.asalsayiMi(59));

        System.out.println(C02_tamBölenler.girilenSayi(12));

        


    }
}
