package day08_ifElseifStatement;

import java.util.Scanner;

public class C07_NestedIfElseStatemenets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz :");
        char cinsiyet = scanner.next().charAt(0);

        System.out.println("Lütfen yasinizi giriniz :");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E'){
            if (yas < 0 || yas > 100){
                System.out.println("gecersiz sayi girdiniz");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir");
            }else {
                System.out.println("emekli olmak icin daha " + ( 65-yas) + "yil calismalisiniz");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 10 || yas > 80){
                System.out.println("Hatali yas girdiniz");
            } else if (yas >= 60) {
                System.out.println("kadin emekli olabilir");
            }else {
                System.out.println("Kadin emekli olmak ici daha " + (60 -yas) + "yikl daha calismalidir.");
            }

        }else {
            System.out.println("Cinsiyet hatali girildi.");
        }
    }
}
