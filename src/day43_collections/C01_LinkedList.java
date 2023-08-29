package day43_collections;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        List<String> isimler = new LinkedList<>();

        isimler.add("Ömer");
        isimler.add("Ali");
        isimler.add("Veli");

        System.out.println(isimler);
        System.out.println("________________________________");

        List<String > ikincilist = new LinkedList<>();

        ikincilist.add("Ali");
        ikincilist.add("Ipek");

        System.out.println(isimler.retainAll(ikincilist));

        System.out.println("__________________________");
        System.out.println(isimler);
        System.out.println("___________________________");
        System.out.println(ikincilist);
        System.out.println("__________________________");
        ikincilist.retainAll(isimler);
        System.out.println(ikincilist);


    }
}
