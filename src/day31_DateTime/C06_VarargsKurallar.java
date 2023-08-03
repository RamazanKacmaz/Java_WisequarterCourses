package day31_DateTime;

public class C06_VarargsKurallar {
    public static void main(String[] args) {

        islemyap (2,4,5);
    }

    public static void islemyap( int ilksayi, int... kalansayi) {

        int toplam = 0;

        for (int each:kalansayi
             ) {
            toplam += each;
        }

        int sonuc = ilksayi *toplam;

        System.out.println(sonuc);
    }
}
