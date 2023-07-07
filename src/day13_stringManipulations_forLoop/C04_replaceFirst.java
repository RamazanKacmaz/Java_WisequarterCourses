package day13_stringManipulations_forLoop;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str = "Java Candir, kendisini cok seviyoruz123.";

        str=str.replaceAll("a","A");

        System.out.println(str.replaceFirst("", " "));

        System.out.println(str.replaceFirst("\\d", " "));

        System.out.println(str.replaceFirst("\\W","*"));

    }
}
