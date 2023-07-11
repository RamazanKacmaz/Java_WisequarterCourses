package day18_WhileLoop_DoWhileLoop_Scope;

import java.util.Scanner;

public class C01_sifrekontrolu {

    public static void main(String[] args) {


        boolean sonuc = false;
        Scanner scanner;
        String sifre;

        while (!sonuc) {
            scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz :");
            sifre = scanner.nextLine();
            sonuc = sifrekontrolet(sifre);

        }
        System.out.println("Sifreniz basariyla kaydedildi");
    }

    public static boolean sifrekontrolet (String sifre){
        int sayac = 0;

        char ilkharf = sifre.charAt(0);
        if (!(ilkharf >= 'a' && ilkharf <= 'z')) {
            sayac++;
        }

        char sonkrakter = sifre.charAt(sifre.length() - 1);

        if (!(sonkrakter >= '0' && sonkrakter <= '9')) {
            System.out.println("son krakter rakam olmai");
            sayac++;
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        if (sifre.length() < 10) {
            System.out.println("sifre 10 krakter olkmai");
            sayac++;
        }
        if (sayac == 0) {
            return true;
        } else {
            return false;
        }
    }
}
