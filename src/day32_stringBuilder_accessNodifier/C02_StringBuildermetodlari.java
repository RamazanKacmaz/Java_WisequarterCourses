package day32_stringBuilder_accessNodifier;

public class C02_StringBuildermetodlari {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java daha da guzellesiyor...");

        sb1.reverse();

        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);

        System.out.println(sb1.deleteCharAt(sb1.length() - 1));

        sb1.delete(9,12);

        System.out.println(sb1);
        sb1.insert(sb1.length(),"r");
        System.out.println(sb1);

        String str = "Java da bundan memnun ";
        sb1.insert(9,str,4,7);
        System.out.println(sb1);






    }
}
