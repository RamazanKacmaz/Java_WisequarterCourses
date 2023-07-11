package day17_methodOlusturma_methodOverloading;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {


        boolean sonuc = false;
        while (sonuc == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz :");
            String sifre = scanner.nextLine();
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


