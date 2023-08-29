package day42_iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04 {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(2);
        sayilar.add(22);
        sayilar.add(32);
        sayilar.add(42);
        sayilar.add(52);
        sayilar.add(62);

        System.out.println(sayilar);

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){
            Integer sayi = (Integer) lit.next();

            if (sayi<20 || sayi>40){
                lit.remove();
            }
        }
        System.out.println(sayilar);
    }


}
