package day15_forloop_Metod_olusturma;

import java.util.Scanner;

public class C04_nestedforloop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen satir gir");
        int satir = scanner.nextInt();


        for (int i = 0; i <=satir ; i++) { //satir


            for (int j = 0; j <= i ; j++) { //sutun

                System.out.print("*   ");
            }
            System.out.println(" ");
        }
    }
}
