package day43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Linkelist_Deque {
    public static void main(String[] args) {

        Deque<String > isimler = new LinkedList<>();

        isimler.add("Cemil");
        isimler.addFirst("Ali");
        isimler.addLast("Veli");
        isimler.add("Ali");
        isimler.add("eyyup");

        System.out.println(isimler);

        System.out.println(isimler.removeLast());
        System.out.println(isimler);

        System.out.println(isimler.removeLastOccurrence("Ali"));
        System.out.println(isimler);

        System.out.println(isimler.pollFirst());
        System.out.println(isimler);

        System.out.println(isimler.poll());
        System.out.println(isimler);

        System.out.println(isimler.offerFirst("Dilek"));
        System.out.println(isimler);

        System.out.println(isimler.pollFirst());

        System.out.println(isimler.element());

        System.out.println(isimler.hashCode());
    }
}
