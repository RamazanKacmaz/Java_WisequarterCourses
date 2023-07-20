package day23_Multi_Diemensional_Arrays;

import java.util.Arrays;

public class C04_ortakindexlisayilaritoplama {
    public static void main(String[] args) {

        int [][] arr = {{3, 4, 5,},{2, 3, 6, 7}};

        int uzunluk = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        int [] yeniarr = new int[uzunluk];

        for (int i = 0; i <yeniarr.length ; i++) {

            yeniarr[i] = arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(yeniarr));
    }
}
