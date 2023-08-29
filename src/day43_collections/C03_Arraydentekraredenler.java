package day43_collections;

import java.util.*;

public class C03_Arraydentekraredenler {
    public static void main(String[] args) {

        int [] liste = {1,2,3,5,4,78,5,4,2,465,6,5,4,1,2,64,};

        List<Integer> tekrarsizlist = new ArrayList<>();

        for (int each:liste
             ) {
            if (!tekrarsizlist.contains(each)){
                tekrarsizlist.add(each);
            }
        }
        System.out.println(tekrarsizlist);

        Set<Integer> liste2 = new TreeSet<>();
        for (int each:liste
             ) {
            liste2.add(each);
        }
        System.out.println(liste2);

        int index = 0;
        liste = new int[liste2.size()];
        for (Integer each:tekrarsizlist
             ) {
            liste[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(liste));
    }
}
