package day32_stringBuilder_accessNodifier;

public class C05 {
    private int privateSayi;
    int defaultSayi;
    protected int protectedSayi;
    public int publicSayi;

    public static void main(String[] args) {

        C05 yeni = new C05();
        yeni.privateSayi = 20;
        System.out.println(" piravate sayi : "+ yeni.privateSayi);
    }
}
