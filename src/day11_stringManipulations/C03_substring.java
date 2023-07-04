package day11_stringManipulations;

import java.util.Locale;

public class C03_substring {
    public static void main(String[] args) {

        String str = "Java Candir...";

        System.out.println(str.length());
        System.out.println(str.substring(3));
        System.out.println(str.substring(1,6));
        System.out.println("========================");
       // System.out.println(str.substring(6,7).toUpperCase(Locale.ROOT));
       // System.out.println(str.substring(8,5));
        System.out.println(str.substring(str.length()-3));

        String str2 = "Java";
        String str3 = " ";
        String  str4 = "Candir";

        System.out.println(str2+str3+str4);
        System.out.println("-------------------------");

        System.out.println(str2.concat(str3).concat(str4));

    }
}
