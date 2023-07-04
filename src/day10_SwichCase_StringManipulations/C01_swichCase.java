package day10_SwichCase_StringManipulations;

import java.util.Scanner;

public class C01_swichCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen anlamini görmek isteginiz harfi girin");

        char harf = scan.next().charAt(0);

        switch (harf){
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yazdiginiz harf ISTQB de yoktur.");

        }
    }
}
