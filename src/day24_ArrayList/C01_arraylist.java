package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arraylist {
    public static void main(String[] args) {

        int [] arr = {2,4,5,3,2,1,5,7};

        List<Integer> tekrarlist = new ArrayList<>();
        System.out.println(tekrarlist);

        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarlist.contains(arr[i])){
                tekrarlist.add(arr[i]);
            }
        }
        System.out.println(tekrarlist);

        arr = new int[tekrarlist.size()];

        for (int i = 0; i <arr.length ; i++) {

            arr[i] = tekrarlist.get(i);

        }

        System.out.println(Arrays.toString(arr));

    }
}
