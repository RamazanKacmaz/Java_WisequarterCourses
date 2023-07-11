package day17_methodOlusturma_methodOverloading;

public class C05_MethodOverloding {
    public static void main(String[] args) {

        toplama('s');
        toplama(3,4);

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

    public static void toplama(int sayi){
        System.out.println("tek girilirse iki kere yazilir :" + 2*sayi);
    }

    public static void  toplama(int a , int b ,int c){
        System.out.println("3 sayinin toplami" + (a+b+c));
    }

    public static void toplama(double a ,double b, double c){
        System.out.println("3 sayinin toplami" + (a+b+c));
    }
}
