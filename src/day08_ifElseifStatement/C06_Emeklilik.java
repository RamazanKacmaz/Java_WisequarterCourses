package day08_ifElseifStatement;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz :");
        char cinsiyet = scanner.next().charAt(0);

        System.out.println("Lütfen yasinizi giriniz :");
        double yas = scanner.nextDouble();

        if (cinsiyet == 'E' && yas >= 65){
            System.out.println("Erkek emekli olabilir.");
        } else if (cinsiyet == 'E' && yas < 65 ) {
            System.out.println("Erkek emekli olamaz, " + (65-yas) + "yil daha calismalisiniz");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Kadin emekli olamaz "+ ( yas-60) + "yil daha calismalisiniz ");
        }else {
            System.out.println("Yanlis bilgi girdiniz.");
        }


    }
}
