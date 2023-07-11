package day18_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C02_girilenSayilariToplama {

    public static void main(String[] args) {

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi ;

        while (sayac <10 && toplam < 500){
            scanner = new Scanner(System.in);
            System.out.println("Sayi giriniz: ");
            sayi = scanner.nextInt();

            toplam += sayi;
            sayac++;
        }

        if (sayac >= 10){
            System.out.println("10 sayi girmelisin" + toplam + " oldu.");
        }

        if (toplam > 500){
            System.out.println("girilen sayi 500 fazla oldu" + toplam + "oldu.");
        }

    }

}
