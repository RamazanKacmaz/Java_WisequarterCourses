package day42_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C03 {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(25);
        sayilar.add(15);
        sayilar.add(35);
        sayilar.add(55);

        ListIterator lit =  sayilar.listIterator();
        System.out.println(sayilar);

        while (lit.hasNext()){
            Integer sayi = (Integer) lit.next();

            lit.set(sayi+2);
        }
        System.out.print(sayilar);
        System.out.println("");

        while (lit.hasPrevious()){
            Integer sayi = (Integer) lit.previous();
            System.out.print(sayi+" ");


        }
    }
}
