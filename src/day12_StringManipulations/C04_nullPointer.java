package day12_StringManipulations;

public class C04_nullPointer {
    public static void main(String[] args) {

        String str1 ;

        //System.out.println(str1);
        //str1.concat("Candir");



        str1 = "Java";

        System.out.println(str1);
        System.out.println(str1.concat("Candir"));

        // null bir deger degil ponniter dir(Isaretleyici)

        String Str2 = null;
        System.out.println(Str2);

        System.out.println(Str2 + "Candir");

        //System.out.println(Str2.concat("candir"));

        Str2 = "tava";

        System.out.println(Str2.concat("candir"));

        String str3 = null;
        String str4 = "";

        System.out.println(str4.isEmpty());
        System.out.println(str4.isBlank());

        //System.out.println(str3.isBlank());
        //System.out.println(str3.isEmpty());





    }
}
