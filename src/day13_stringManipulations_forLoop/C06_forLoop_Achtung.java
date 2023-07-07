package day13_stringManipulations_forLoop;

public class C06_forLoop_Achtung {
    public static void main(String[] args) {

        for (int i = 0; i > 10 ; i++) {
            System.out.println(1);
        }

        /*for (int i = 0; i >=0 ; i++) {
            System.out.println(i + " ");
        }*/

        int baslangic = 201;
        int bitis = 237;

        int aranansayi = 43;

        for (int i = baslangic; i <= bitis ; i++) {
            System.out.print(i + " ");
            System.out.println("______________________");
            if (i % aranansayi == 0) {
                System.out.println("aranan sayi vaar");
                break;
            }
        }


    }
}
