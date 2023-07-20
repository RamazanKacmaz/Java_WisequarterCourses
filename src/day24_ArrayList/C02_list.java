package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_list {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        System.out.println(isimler);

        isimler.add("Burhan");
        isimler.add("seref");
        isimler.add("Gülsah");

        System.out.println(isimler);

        isimler.add(2,"Nergiz");
        System.out.println(isimler);
        isimler.add(1,"Ömer");
        System.out.println(isimler);
        isimler.addAll(2,isimler);
        System.out.println(isimler);
        isimler.add("Eyyup");
        System.out.println(isimler);
    }




}
