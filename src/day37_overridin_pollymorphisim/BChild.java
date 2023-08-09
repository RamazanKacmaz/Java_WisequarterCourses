package day37_overridin_pollymorphisim;

public class BChild  extends  Aparent{

    final static int sayi = 10;
    final static int sayi2 = 20;

    /*public final void finalMethid(){
        //final method ovverride edilemeyen method demektir
        System.out.println("Bu Child bir final method");
    }*/

    public static void staticMethod(){
        System.out.println("Bu  Child bir tativ method");
    }
    private void privateMethod(){
        System.out.println("Bu Child bir private method");
    }

    public static void main(String[] args) {

        System.out.println(sayi);
        //sayi = 20;

        System.out.println(Integer.MAX_VALUE);
    }
}
