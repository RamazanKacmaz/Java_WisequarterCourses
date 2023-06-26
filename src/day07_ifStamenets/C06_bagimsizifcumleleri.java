package day07_ifStamenets;

import java.util.Scanner;

public class C06_bagimsizifcumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi griniz");

        int girilensayi = scanner.nextInt();

        if (girilensayi % 3 == 0 && girilensayi % 5 == 0){
            System.out.println("guzel sayi");
        }
    }
}
