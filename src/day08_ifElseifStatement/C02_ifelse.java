package day08_ifElseifStatement;

import java.util.Scanner;

public class C02_ifelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz : ");

        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0){
            System.out.println("super sayi");
        }else {
            System.out.println("dandik sayi");
        }
    }
}
