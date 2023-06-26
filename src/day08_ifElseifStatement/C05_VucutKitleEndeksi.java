package day08_ifElseifStatement;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen boy giriniz :");
        double boy = scanner.nextDouble();

        System.out.println("Lutfen kilo giriniz :");
        double kilo = scanner.nextDouble();

        double vkt = kilo*10000 / (boy*boy);

        if ( vkt >= 30){
            System.out.println("Obez");
        } else if ( vkt >= 25) {
            System.out.println("Kilolu");
        } else if ( vkt >= 20) {
            System.out.println("normal");
        } else{
            System.out.println("Zayif");
        }
    }
}
