package day22_Arrays_Multi_Dimensionl_Arrays;

import java.util.Arrays;

public class C02_sort {
    public static void main(String[] args) {

        String [] harfler = {"L" , "a", "P" , "d" , "T", "t"};

        System.out.println(Arrays.toString(harfler));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));

        String [] isimler = {"ayse" , "yusuf" , "bugra" , "abdullah" , "Nergiz"};

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));


    }
}
