package day31_DateTime;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println(tarihSaat);

        LocalDateTime baslma = LocalDateTime.now();
        int baslangicZamani = baslma.getNano();

        int toplam = 0;
        for (int i = 1; i < 10000; i++) {
            toplam += i ;
        }
        LocalDateTime bitirma = LocalDateTime.now();
        int bitisZamani = bitirma.getNano();

        System.out.println("Islem suresi : " + ( bitisZamani-baslangicZamani));


    }
}
