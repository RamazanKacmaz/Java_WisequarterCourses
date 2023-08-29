package day44_Maps;

import java.util.Map;
import java.util.TreeMap;

public class C01_mapOlusturma {

    public static void main(String[] args) {

        Map< Integer , String > ogrenciMap = new TreeMap<>();
        ogrenciMap.put(101, "Ali Can 11 H MF");
        ogrenciMap.put(102, "Veli Can 11 H MF");
        ogrenciMap.put(103, "Ayse Can 11 H MF");
        ogrenciMap.put(104, "Sevgi Can 11 H MF");
        ogrenciMap.put(105, "Selim Can 11 H MF");
        ogrenciMap.put(106, "Salim Can 11 H MF");

        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.keySet());
        System.out.println(ogrenciMap.values());


    }
}
