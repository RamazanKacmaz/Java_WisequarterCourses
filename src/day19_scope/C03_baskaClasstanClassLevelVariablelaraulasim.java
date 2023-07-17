package day19_scope;

public class C03_baskaClasstanClassLevelVariablelaraulasim {
    public static void main(String[] args) {

        System.out.println(C02_ClassLevelVariable.bls);
        System.out.println(C02_ClassLevelVariable.chrs);
        System.out.println(C02_ClassLevelVariable.strs);
        System.out.println(C02_ClassLevelVariable.sayis);

        C02_ClassLevelVariable obj = new C02_ClassLevelVariable();
        System.out.println(obj.bli);
        System.out.println(obj.sayii);
        System.out.println(obj.chri);
        System.out.println(obj.stri);

        System.out.println(obj.bls);

    }

}
