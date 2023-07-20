package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Kagan");
        isimler.add("Bulent");
        isimler.add("Tugba");
        isimler.add("Burhan");
        isimler.add("Kagan");

        System.out.println(isimler);
        System.out.println(isimler.remove("Hasan"));
        System.out.println(isimler.remove("Kagan"));

        System.out.println(isimler);

        System.out.println(isimler.remove(1));

        System.out.println(isimler);

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(1);
        sayilar.add(9);

        System.out.println(sayilar);

        sayilar.remove(1);
        System.out.println(sayilar);

        Integer silincek = 1 ;
        sayilar.remove(silincek);
        System.out.println(silincek);

        System.out.println(sayilar);

        sayilar.clear();
        System.out.println(sayilar);

    }


}
