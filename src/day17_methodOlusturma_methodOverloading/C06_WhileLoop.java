package day17_methodOlusturma_methodOverloading;

public class C06_WhileLoop {

    public static void main(String[] args) {

        int toplam = 0;

        for (int i = 1; i <=100 ; i++) {

            toplam += i;
        }


        System.out.println(toplam);
        System.out.println("_____________________________________");

        toplam = 0;

        int i = 1;

        while (i <= 100){
            toplam += i ;
            i++;
        }
        System.out.println(toplam);
    }
}
