package day22_Arrays_Multi_Dimensionl_Arrays;

import java.util.Arrays;

public class C06_ArrayeBirElemnteEkleme {
    public static void main(String[] args) {

        int [] arr  = {3,7,8};

        int eklenecekSayi = 10;

        int [] yeniarr = new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            yeniarr[i] = arr[i];
        }

        yeniarr[yeniarr.length-1] = eklenecekSayi;

        arr = yeniarr;

        System.out.println(Arrays.toString(yeniarr));
    }

    public static int [] arryebirelamekle(int [] eskiArr , int eklenceksayi){

        int [] yeniarr = new int[eskiArr.length+1];

        for (int i = 0; i < eskiArr.length ; i++) {
            yeniarr[i] = eskiArr[i];
        }

        yeniarr[yeniarr.length-1] = eklenceksayi;

        eskiArr = yeniarr;

        return yeniarr;


    }
}
