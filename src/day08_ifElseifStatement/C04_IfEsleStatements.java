package day08_ifElseifStatement;

import java.util.Scanner;

public class C04_IfEsleStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz :");

        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5  == 0 ){
            System.out.println("super sayi");
        } else if (sayi % 3 == 0) {
            System.out.println("Sayi  ucun kati");
        } else if (sayi % 5 == 0) {
            System.out.println("sayi 5 kati");
        }else {
            System.out.println("3 ve 5 kati degil");
        }
    }
}
