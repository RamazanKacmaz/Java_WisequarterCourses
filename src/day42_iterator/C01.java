package day42_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        int [] arr = {3,4,5,6};
        System.out.println("oce arr" + Arrays.toString(arr));

        for (int each:arr
             ) {
            each += 2;
        }

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(25);
        sayilar.add(15);
        sayilar.add(35);
        sayilar.add(55);

        System.out.println(sayilar);

        Iterator itr = sayilar.iterator();
        itr.next();
        itr.remove();
        System.out.println(sayilar);

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        itr.next();
        itr.remove();

        System.out.println(sayilar);


    }


}
