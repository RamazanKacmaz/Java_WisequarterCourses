package day14_ForLoop_Nested_forLoop;

import java.util.Scanner;

public class C05_übung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        int sayi = girilenSayi;

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        int basamakSayisi = (sayi + "").length();

        for (int i = 1; i < basamakSayisi; i++) {
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;
        }

        System.out.println(girilenSayi + " " + rakamlarToplami);
    }
}
