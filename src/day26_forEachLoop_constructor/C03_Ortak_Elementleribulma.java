package day26_forEachLoop_constructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Ortak_Elementleribulma {

    public static void main(String[] args) {

        int [] arr1 = {3,5,8,1,3,9,2,4,7,1};
        int [] arr2 = {2,7,3,5,8,1,9,0,3,5,7};

        List<Integer> ortakElamanalr = new ArrayList<>();

        for (Integer each1:arr1
             ) {
            for (Integer each2 :arr2
            ) {
                if (each1 == each2 && ortakElamanalr.contains(each1));
            }
            ortakElamanalr.add(each1);

                  {

            }
        }
        Collections.sort(ortakElamanalr);
        System.out.println(ortakElamanalr);
    }

    public static class C04 {
        int sayi = 10;
        int kapasite ;

        String ogrenciismi;
        int hiz;

        public void metod1(){
            System.out.println("metod1 calisti");
        }
    }
}
