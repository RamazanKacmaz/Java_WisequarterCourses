package day22_Arrays_Multi_Dimensionl_Arrays;

import java.util.Arrays;

public class C04_strSplitmethodu {
    public static void main(String[] args) {

        String str = "Java candir, Selenium heyacan";
        String [] krlmelr = str.split(" ");
        System.out.println(Arrays.toString(krlmelr));

        String [] str1  = str.split(", ");

        System.out.println(Arrays.toString(str1));

        String [] krakter = str.split("");
        System.out.println(Arrays.toString(krakter));

    }
}
