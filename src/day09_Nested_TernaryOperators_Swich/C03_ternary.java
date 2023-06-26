package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C03_ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");

        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Cift sayi");
        }else {
            System.out.println("tek sayi");
        }
        /* if else kolayi
        basit isemler icin
         */

        System.out.println( sayi % 2 == 0 ? " cift sayi" : "tek sayi");
    }
}
