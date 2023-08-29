package day44_Maps;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MethodDeposu {
    public static Map<Integer, String> ogrencimapolustur() {

        Map<Integer, String> ogrenciMap = new TreeMap<>();
        ogrenciMap.put(101, "Ali Can 11 H MF");
        ogrenciMap.put(102, "Veli Can 11 H MF");
        ogrenciMap.put(103, "Ayse Can 11 H MF");
        ogrenciMap.put(104, "Sevgi Can 11 H MF");
        ogrenciMap.put(105, "Selim Can 11 H MF");
        ogrenciMap.put(106, "Salim Can 11 H MF");

        return ogrenciMap;
    }

    public static void isimsoyisimlistesiyazdir(Map<Integer, String> ogrenciMap) {
        Collection<String> valueCollection = ogrenciMap.values();





    }
}
