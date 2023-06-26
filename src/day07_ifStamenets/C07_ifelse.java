package day07_ifStamenets;

import java.util.Scanner;

public class C07_ifelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if(not >= 50) System.out.println("sinifi gectin");
        if (not < 50 ) System.out.println("maleef kaldin");

        if (not >= 50 ){
            System.out.println("sinifi gectin haci");
        }else{
            System.out.println("klain laaaa");
        }


    }
}
