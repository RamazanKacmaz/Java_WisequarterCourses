package day11_stringManipulations;

import java.util.Scanner;

public class C02_length {
    public static void main(String[] args) {
        /*String isim1 = "RamazanKacmaz";

        System.out.println(isim.length());
        System.out.println("============================");
        System.out.println(isim.charAt(isim.length()-1));
        System.out.println("============================");
        System.out.println(isim.charAt(isim.length()-5));
        System.out.println("==========================");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");

        String isim = scanner.nextLine();

        int uzunluk = isim.length();

        if (uzunluk % 2 == 0 ){
            System.out.println(isim.charAt(uzunluk/2-1) + isim.charAt(uzunluk/2));
        }else {
            System.out.println(isim.charAt(uzunluk-1)/2);
        }


    }
}
