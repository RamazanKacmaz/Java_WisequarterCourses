package day19_scope;

public class C02_ClassLevelVariable {

    static boolean bls;
    boolean bli ;

    static String strs = "JAva ";

    String stri ;

    static  int sayis ;

    int sayii = 23;

    static  char chrs = 'a';

    char chri ;



    public static void main(String[] args) {

        System.out.println(bls);
        System.out.println(strs);
        System.out.println(sayis);
        System.out.println(chrs);

        C02_ClassLevelVariable obj = new C02_ClassLevelVariable();

        System.out.println(obj.bli);
        System.out.println(obj.stri);
        System.out.println(obj.sayii);
        System.out.println(obj.chri);

    }
}
