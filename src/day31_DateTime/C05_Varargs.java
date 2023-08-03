package day31_DateTime;

public class C05_Varargs {
    public static void main(String[] args) {
        toplama(3,5);
        toplama(3,5,7);
        toplama(3,5,1,2);
        toplama(3,6,8,3,2,1);

    }

    public static void toplama(int... sayi1 ){

        int toplam = 0;

        for (int i = 0; i <sayi1.length ; i++) {
            toplam += sayi1 [i];
        }

        System.out.println("sayi topkami : "+ toplam );
    }

}
