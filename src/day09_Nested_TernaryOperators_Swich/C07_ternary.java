package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C07_ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        double sayi = scanner.nextDouble();

        System.out.println(sayi > 0 ? sayi : -1*sayi);
    }
}
