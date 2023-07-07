package day14_ForLoop_Nested_forLoop;

import java.util.Scanner;

public class C04_übung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 20 den kucuk bir pozitif tamsayi giriniz :");

        int sayi = scanner.nextInt();

        int carpim = 1;

        if (sayi < 20){

            for (int i = 1; i <= sayi ; i++) {
                carpim *= i ;
            }
            System.out.println(carpim);
        }else {
            System.out.println("yanlis girdiniz");
        }


    }
}
