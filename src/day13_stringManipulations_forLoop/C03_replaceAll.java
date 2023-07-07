package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_replaceAll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz :");
        String metin = scanner.nextLine();
        metin=metin.replaceAll("\\W","");
        metin=metin.replaceAll("\\s","");
        metin=metin.replaceAll("1","");
        metin=metin+".";

        System.out.println("Duzeltilen metin : " + metin.replaceAll("\\d", ""));



    }
}
