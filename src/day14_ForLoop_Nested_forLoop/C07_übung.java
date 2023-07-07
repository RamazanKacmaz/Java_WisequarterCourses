package day14_ForLoop_Nested_forLoop;

import java.util.Scanner;

public class C07_übung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime yaziniz : ");
        String terYazi = scanner.nextLine();

        for (int i = terYazi.length()-1; i >=0 ; i--) {
            System.out.print(terYazi.charAt(i));
        }

        String tersMetin = "";

        for (int i = terYazi.length()-1; i >=0 ; i--) {
            tersMetin += terYazi.charAt(i);
        }
        System.out.print(tersMetin);
    }
}
