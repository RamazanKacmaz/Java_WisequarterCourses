package day08_ifElseifStatement;

import java.util.Scanner;

public class C01_ifElsestemanet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Lutfen bir karakter giriniz ; ");

        char grilenkrakter = scanner.next().charAt(0);

        if (grilenkrakter >= 'A' && grilenkrakter <='Z'){
            System.out.println("girilen krakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degildir");
        }*/

        System.out.println("Lutfen notunuzu giriniz : ");

        int note = scanner.nextInt();

        if (note >= 85 ){
            System.out.println("AA gectiniz");
        }else if (note >= 65) {
            System.out.println("BB Gectiniz");
        } else if (note >= 55) {

        } else if (note >= 45) {
            System.out.println("CC Kaldiniz");
        }else {
            System.out.println("yanlis note girdiniz");
        }


    }
}

