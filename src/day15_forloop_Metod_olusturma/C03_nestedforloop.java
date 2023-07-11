package day15_forloop_Metod_olusturma;

public class C03_nestedforloop {
    public static void main(String[] args) {

        for (int i = 0; i <=4 ; i++) {


            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
