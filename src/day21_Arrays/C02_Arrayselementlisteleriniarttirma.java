package day21_Arrays;

import java.util.Arrays;

public class C02_Arrayselementlisteleriniarttirma {
    public static void main(String[] args) {

        int [] arr = {3,5,2,7,5};
        int artis = 4 ;

        for (int i = 0; i <arr.length ; i++) {

            arr[i] += artis;
        }

        System.out.println(Arrays.toString(arr));

        int [] sayilar = {5,8,2};
        System.out.println(Arrays.toString(elemmentleriArtir(sayilar,5)));

    }

    public static int [] elemmentleriArtir (int [] arr , int artis){

        for (int i = 0; i < arr.length ; i++) {
            arr[i] += artis;
        }
        return  arr;
    }
}
