package day10_SwichCase_StringManipulations;

import java.util.Scanner;

public class C02_SwichCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gun numarasi giriniz...");

        int gunNo = scanner.nextInt();

        switch (gunNo){
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Hafta ici");
                break;
            case 6 :
            case 7 :
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gun numarasi 1-7 arasinda olmalidir...");
        }
    }
}
