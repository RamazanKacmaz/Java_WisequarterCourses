package day22_Arrays_Multi_Dimensionl_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_übing {

    public static void main(String[] args) {

        int [] arr = {3,5,8};

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayi gir");
        int eklencceksayi = scanner.nextInt();
        arr = C06_ArrayeBirElemnteEkleme.arryebirelamekle(arr, eklencceksayi);

        System.out.println(Arrays.toString(arr));

       arr = C06_ArrayeBirElemnteEkleme.arryebirelamekle(arr, 11);
    }
}
