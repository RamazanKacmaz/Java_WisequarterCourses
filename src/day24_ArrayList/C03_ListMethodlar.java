package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethodlar {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        sayilar.add(3);
        sayilar.add(6);

        System.out.println(sayilar);
        System.out.println(sayilar.size());
        System.out.println(sayilar.isEmpty());

        System.out.println(sayilar.get(1));

        System.out.println(sayilar.contains(3));

        List<Integer> tamsayilar = new ArrayList<>();

        tamsayilar.add(1);
        tamsayilar.add(3);
        tamsayilar.add(5);
        tamsayilar.add(7);

        System.out.println(tamsayilar.containsAll(sayilar));


    }
}
