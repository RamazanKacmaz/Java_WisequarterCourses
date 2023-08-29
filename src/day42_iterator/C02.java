package day42_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02 {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(25);
        sayilar.add(15);
        sayilar.add(35);
        sayilar.add(55);

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()){
            int sayi= (Integer )itr.next();

            if (sayi>10){
                itr.remove();
            }
        }
        System.out.println(sayilar);
    }
}
