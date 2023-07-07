package day13_stringManipulations_forLoop;

public class C05_forLoop {
    public static void main(String[] args) {
        int input = 20;

        for (int i = input; i < input+10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int i = input; i <= 100 ; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println("____________________________");

        int sayi = 1 ;

        for (int i = 100; i >= 1 ; i--) {
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }


    }
}
