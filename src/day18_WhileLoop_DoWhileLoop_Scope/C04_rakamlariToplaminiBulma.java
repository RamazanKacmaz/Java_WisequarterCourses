package day18_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C04_rakamlariToplaminiBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak istedigniiz rakaminyaziniz :");

        int girilensayi = scanner.nextInt();

        int sayi = girilensayi;

        int birlermasamagi = 0;
        int rakamalrtolami = 0;

        while (sayi>0){
            birlermasamagi = sayi%10;
            rakamalrtolami += birlermasamagi;
            sayi /= 10;
        }
        System.out.println("girilen"+ girilensayi + "nin toplami " + rakamalrtolami);
    }
}
