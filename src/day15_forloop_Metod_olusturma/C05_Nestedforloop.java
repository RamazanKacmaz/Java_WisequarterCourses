package day15_forloop_Metod_olusturma;

public class C05_Nestedforloop {
    public static void main(String[] args) {

        int satir = 5;
        int sutun = 7;

        for (int i = 1; i <=satir ; i++) {

            for (int j = 5; j <=sutun ; j++) {

                System.out.print(i + " ," + j + " , ");
            }
            System.out.print("");
        }
        System.out.print("----------------------------------");

        for (int i = 1; i <=satir ; i++) {

            for (int j = 0; j <=1 ; j++) {
                System.out.print(i + " ," + j + " , ");
            }
            System.out.println("");
        }
    }
}
