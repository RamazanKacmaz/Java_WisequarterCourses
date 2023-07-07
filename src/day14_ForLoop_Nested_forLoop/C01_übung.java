package day14_ForLoop_Nested_forLoop;

import java.util.Scanner;

public class C01_übung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sifre giriniz :");
        String sifre = scanner.nextLine();

        boolean flag = true;

        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf >= 'a' && ilkHarf >= 'z')){
            System.out.println("ilk krkazer kucuk harf olmali .");
            flag = false;
        }

        char sokrakter = sifre.charAt(sifre.length()-1);
        if (!(sokrakter>='0' && sokrakter<='9')){
            System.out.println("Son krakter rakam olmali");
            flag = false;
        }

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag=false;
        }

        if (!(sifre.length()>=10)){
            System.out.println("sifre 10 krakter olmali");
            flag= false;
        }

        if (false){
            System.out.println("Sifre basarili sekilde kaydedildi...");
        }

    }
}
