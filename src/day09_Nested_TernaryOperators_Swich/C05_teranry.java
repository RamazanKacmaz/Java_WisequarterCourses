package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C05_teranry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ucgenin 3 kenar uzunlugunu yaziniz.");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ? "Eskanar ucgen " : "Eskanar degil");
    }
}
