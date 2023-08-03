package day31_DateTime;

public class C07_Vararags {
    public static void main(String[] args) {

        islemyap(3,4,6,1,7,1,0);
        islemyap(4,5,6);
        islemyap(2,3);

    }

    public static void islemyap (int sayi1 , int sayi2 , int... klanlar){
        System.out.println(klanlar.length);
    }

}
