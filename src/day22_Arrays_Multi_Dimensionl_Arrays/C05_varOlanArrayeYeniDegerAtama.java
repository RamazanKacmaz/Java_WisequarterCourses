package day22_Arrays_Multi_Dimensionl_Arrays;

import java.util.Arrays;

public class C05_varOlanArrayeYeniDegerAtama {

    public static void main(String[] args) {

        int [] arr = {3,4,5,6,7,8,1};
        System.out.println(arr.length);

        //arr[6] =13;

        arr = new int[8];
        System.out.println(Arrays.toString(arr));

        String [] harfler = {"a", "n" , "y"};
        String [] yeniharfler = {"k" , "l" , "m", "n"};

        harfler = yeniharfler;

        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.toString(yeniharfler));

        harfler = new String[]{"x",};
        System.out.println(Arrays.toString(harfler));
    }
}
