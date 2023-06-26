package day08_ifElseifStatement;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu giriniz : ");

        int note = scanner.nextInt();

        if (note >= 85 ){
            System.out.println("Notunuz AA");
        } else if (note >= 65) {
            System.out.println("Notunuz BB");
        } else if (note >= 50) {
            System.out.println("Notunuz CC");
        }else {
            System.out.println("Notunuz DD");
        }
    }
}
