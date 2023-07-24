package day26_forEachLoop_constructor;

import day15_forloop_Metod_olusturma.C04_nestedforloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C05_Runner {
    public static void main(String[] args) {

        String str = new String("Java Candir");


        C04 obje = new C04();

        List<String> liste = new ArrayList<>();

        Random random = new Random();

        System.out.println(obje.hiz);
        System.out.println(obje.kapasite);
        System.out.println(obje.ogrenciIsmi);
        System.out.println(obje.sayi);
        obje.method1();


    }
}
