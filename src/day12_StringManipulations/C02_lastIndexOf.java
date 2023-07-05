package day12_StringManipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String str = "Javayi ogrenecegiz, baska yolu yok";

        System.out.println(str.indexOf("a"));

        System.out.println(str.lastIndexOf("a"));

        System.out.println(str.indexOf("j"));
        System.out.println(str.lastIndexOf("J"));

        int ilkindex = str.indexOf("e");
        int sonindex = str.lastIndexOf("e");

        if (ilkindex == -1) {
            System.out.println("hic e kullanilmamis");
        } else if (ilkindex == sonindex) {
            System.out.println("sadece bir e kullanilmis");
        } else {
            System.out.println("e harfi 2 kere veya daha fazla kullanilmis");
        }

        System.out.println(str.lastIndexOf("o"));

        System.out.println(str.lastIndexOf("o", 31));

        System.out.println(str.lastIndexOf('k'));
        System.out.println("--------------------------");

        System.out.println(str.lastIndexOf("y"));
        System.out.println(str.lastIndexOf('y') - 1);




    }
}
