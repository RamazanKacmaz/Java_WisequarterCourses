package day13_stringManipulations_forLoop;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Java 8C9a2n5d1i1r.";

        str = str.replace("1","");

        System.out.println(str);

        str = str.replaceAll("\\d", "");
        System.out.println(str);



    }
}
