package day17_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C01_AsalSayiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("asal sayi girniz :");

        int sayi = scanner.nextInt();


    }
    public static boolean asalsayiMi (int sayi){
        boolean flag = true;

        for (int i = 2; i <sayi ; i++) {
            if (sayi % i == 0){
                flag = false;
               break;
            }
        }
        if (flag){
            return true;
        }else {
            return false;
        }
    }
}
