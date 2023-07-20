package day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_get_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Cemil");
        isimler.add("Ömer");
        isimler.add("Meran");
        isimler.add("Sami");

        isimler.add(2,"Burhan");

        System.out.println(isimler);

        isimler.set(2,"Ayse");

        System.out.println(isimler);


        System.out.println(isimler.get(1));


    }
}
