package day18_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C05_usHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi ve hesaplamak istedihiniz ussu yazin: ");
        double sayi = scanner.nextDouble();
        System.out.println("us icin sayi giriniz");
        int us = scanner.nextInt();
        ushesapla(sayi,us);


    }

    public static void ushesapla (double sayi , int us){
        double sonuc = 1;

        while (us > 0 ){
            sonuc *= sayi;
            us--;
        }
        System.out.println("sonuc" + sonuc);
    }
}
