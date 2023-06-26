package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C01_Emeklilik2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek , K : Kadin :");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz :");
        double yas = scanner.nextDouble();

        if (yas < 10 || yas > 80) {
            System.out.println("gecersiz yas");
        } else if (yas < 60) {
            if (cinsiyet == 'K') {
                System.out.println("Kadin emekli olabilmek icin daha " + (60 - yas) + " yil daha calsimali");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olabilmek icin " + (65 - yas) + "daha calismali");
            } else {
                System.out.println("cinsiyet hatali");
            }
        } else if (yas < 65) {
            if (cinsiyet == 'K') {
                System.out.println("Kadin emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olmak icin daha " + (65 - yas) + "yil daha calismali");
            } else {
                System.out.println("Cinsiyet hatali");
            }
        } else {
            if (cinsiyet == 'K' || cinsiyet == 'E') {
                System.out.println("emekli olabilir");
            } else {
                System.out.println("Cinsiyet hatali");
            }
        }
    }
}
