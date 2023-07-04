package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C08_SwichStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir ay numarasi yaziniz : ");
        int ay = scanner.nextInt();

        if (ay == 1) System.out.println("ocak");
        else if (ay == 2 ) {System.out.println("subat");}
        else if (ay == 3 ) {System.out.println("mart");}
        else if (ay == 4 ) {System.out.println("nisan");}
        else if (ay == 5 ) {System.out.println("mayis");}
        else if (ay == 6 ) {System.out.println("haziran");}
        else if (ay == 7 ) {System.out.println("temmuz");}
        else if (ay == 8 ) {System.out.println("agustos");}
        else if (ay == 9 ) {System.out.println("eylül" );}
        else if (ay == 10 ) {System.out.println("Ekim");}
        else if (ay == 11 ) {System.out.println("Kasim");}
        else if (ay == 12 ) {System.out.println("aralik");}
        else {System.out.println("gecersiz bit tarih");}

        System.out.println("==========================================");

    switch (ay){
        case 1 :
            System.out.println("ocak");
            break;
        case 2 :
            System.out.println("subat");
            break;
        case 3 :
            System.out.println("mart");
            break;
        case 4 :
            System.out.println("nisan");
            break;
        case 5 :
            System.out.println("mayis");
            break;
        case 6 :
            System.out.println("haziran");
            break;
        case 7 :
            System.out.println("temmuz");
            break;
        case 8 :
            System.out.println("agustos");
            break;
        case 9 :
            System.out.println("eylül");
            break;
        case 10 :
            System.out.println("ekim");
            break;
        case 11 :
            System.out.println("kasim");
            break;
        case 12 :
            System.out.println("aralik");
            break;
        default:
            System.out.println("Gecersiz tarih");


    }

    }
}
