package day12_StringManipulations;

public class C03_isEmty_isBlank {
    public static void main(String[] args) {

        String str = "";
        String str2 = " ";
        String str3 = ".";

        System.out.println(str.isEmpty());
        System.out.println(str2.isEmpty());

        System.out.println(str.isBlank());
        System.out.println(str2.isBlank());

        System.out.println(str3.isEmpty());
        System.out.println(str3.isBlank());
    }
}
