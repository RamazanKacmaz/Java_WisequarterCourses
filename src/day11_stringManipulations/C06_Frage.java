package day11_stringManipulations;

import java.util.Scanner;

public class C06_Frage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte schreiben Sie Mail");

        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali.");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }

    }
}
