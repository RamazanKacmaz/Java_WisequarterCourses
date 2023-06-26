package day07_ifStamenets;

import java.util.Scanner;

public class C05_Bagimsizifcumleleri {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin kenanr uzunluklarini giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ){
            System.out.println("Eskenar ucgen");
        }

    }
}
