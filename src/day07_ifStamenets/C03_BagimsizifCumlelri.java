package day07_ifStamenets;

import java.util.Scanner;

public class C03_BagimsizifCumlelri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int girilensayi = scanner.nextInt();

        if (girilensayi % 5 == 0) System.out.println("Sayi 5 in tam kati");
    }
}
