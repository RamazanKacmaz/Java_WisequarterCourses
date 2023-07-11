package day16_metodOlusturma_kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.println("Lufen soyisminizi giriniz :");
        String soyisim = scanner.nextLine();

        System.out.println(isimDuzenle(isim, soyisim));
        String isimduzenle = isimDuzenle(isim,soyisim);


    }

    public static String isimDuzenle (String  isim , String soyisim){
        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0,1).toLowerCase()+ soyisim.substring(1).toLowerCase();

        String istenenisim = isim+" "+ soyisim;

        return istenenisim;


    }
}
