package day15_forloop_Metod_olusturma;

import java.util.Scanner;

public class C02_nestedforloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("olusturalvcak seklin satir sayisini giniz");
        int satir = scanner.nextInt();

        System.out.println("sutun sayisini girniiz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=sutun ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
