package day11_stringManipulations;

public class C05_starsWith_endsWith {

    public static void main(String[] args) {

        String str = " Java cok guzel";

        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("J"));
        System.out.println("Ja");
        System.out.println(str.startsWith(""));
        System.out.println(str.startsWith("ok",6));
        System.out.println("---------------------");
        System.out.println(str.endsWith("el"));
        System.out.println("------------------------");
        System.out.println(str.endsWith(" "));
        System.out.println();

    }
}
