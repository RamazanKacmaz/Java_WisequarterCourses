package day17_methodOlusturma_methodOverloading;

public class C04_MethodOverloding {

    public static void main(String[] args) {

        toplama(4,6);
        toplama(5,6.4);
        toplama(6.4 ,5);
        toplama(4.3,6.5);

        toplama(3.4f, 5 );

        toplama(2.3f , 5f);


    }

    public static void toplama(int sayi1 , int sayi2){

        System.out.println("iki sayinin tolami " + (sayi1+ sayi2));
    }

    public static void toplama(int a , double b){
        System.out.println("int ile double toplami "+ (a+b));
    }

    public static void toplama(double b , int a){
        System.out.println("double ile int toplami :" + (a+b));
    }

    public static void toplama(double sayi1 , double sayi2){

        System.out.println("double ve double toplami" + (sayi1+sayi2));
    }
}
