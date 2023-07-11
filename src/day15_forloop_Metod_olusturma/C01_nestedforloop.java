package day15_forloop_Metod_olusturma;

public class C01_nestedforloop {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " " );

        }
        System.out.println();
        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i*2 + " ");
        }
        System.out.println();
        for (int i = 1; i <= 4 ; i++) {
            System.out.print(i*3 + " ");
        }
        System.out.println("-------------------------");

        for (int j = 1; j <= 3 ; j++) {
            for (int i = 0; i <= 4 ; i++) {
                System.out.println(i*j + " ");
            }
            System.out.println("");
        }
    }
}
