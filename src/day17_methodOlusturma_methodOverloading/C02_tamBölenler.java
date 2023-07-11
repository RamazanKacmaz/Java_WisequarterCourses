package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;
import java.util.SortedMap;

public class C02_tamBölenler {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println(girilenSayi(sayi));

    }

    public static int girilenSayi(int sayi){

        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0){
                sayac++;
            }
        }
        return sayac;
    }
}
