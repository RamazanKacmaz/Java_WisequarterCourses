package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C06_ternary {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);
    }
}
