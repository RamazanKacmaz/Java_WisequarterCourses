package day27_parametreliConsructer;

import day13_stringManipulations_forLoop.C03_replaceAll;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();
        System.out.println(araba1);

        araba1.marka = "Mercedes";
        araba1.marka = "E200";
        araba1.yil = 2010;
        araba1.fiyat = 15000;
        araba1.renk = "Siyah";
        System.out.println(araba1);

        C03_Araba araba2 = new C03_Araba("BMW", "5.20", 2017 , 3300, "Mavi");

        C03_Araba araba3 = new C03_Araba("Vovo","C40", 2005, 5000, "yesil");

        System.out.println(araba3);
    }
}
