package day11_stringManipulations;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java Candir.";

        // ilk harf yazdirma
        System.out.println(str.charAt(0));

        // 7. Harf yaudirma
        System.out.println(str.charAt(6));

        // bu metnin uzunlugu
        System.out.println(str.charAt(11-1));

        //System.out.println(str.charAt(20));

        System.out.println(str.toUpperCase().charAt(3));
    }
}
