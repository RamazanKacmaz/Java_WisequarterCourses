package day34_inheritance;

public class DRunner {
    public static void main(String[] args) {

        Crolla coralla = new Crolla();
        System.out.println(coralla.uretimyeri);
        System.out.println(coralla.model);
        System.out.println(coralla.aku);

        System.out.println(coralla.marka);
        System.out.println(coralla.lastik);
        System.out.println(coralla.guvenlik);

        System.out.println(coralla.yakit);
        coralla.yakit = "Benzin";
        System.out.println(coralla.yakit);
        System.out.println(coralla.yil);
        System.out.println(coralla.renk);
    }
}
