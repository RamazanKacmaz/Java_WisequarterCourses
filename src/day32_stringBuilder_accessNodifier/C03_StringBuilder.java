package day32_stringBuilder_accessNodifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        String str = "Ramazan iyidir...";

        StringBuilder sb1 = new StringBuilder();

        sb1 = new StringBuilder(str);
        System.out.println(sb1);

        System.out.println(sb1.substring(0, 4));

        System.out.println(sb1.toString().contains("J"));


    }
}
