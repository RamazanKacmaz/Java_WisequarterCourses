package day18_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {

        /*Scanner scanner;

        int sayac = 0;
        int toplam = 0;
        int girilensayi = 1;

        while (girilensayi != 0){
            scanner = new Scanner(System.in);
            System.out.println("sayi giribinz");
            girilensayi = scanner.nextInt();
            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }


        }
        System.out.println("Lutfen pozitif bitr sayi giriniz" +sayac + "  " + girilensayi);*/

        Scanner scanner;

        int sayac = 0;
        int toplam = 0;
        int girilensayi;

        do {
            scanner = new Scanner(System.in);
            System.out.println("sayi girin.............");
            girilensayi = scanner.nextInt();

            if (girilensayi != 0 ) {
                toplam += girilensayi;
                sayac++;
            }
        } while (girilensayi != 0) ;

            System.out.println("Lutfen pozitif bitr sayi giriniz " + sayac + "  " + toplam);



    }

}
