package day25_ArrayList_For_each_Loop;

import java.util.ArrayList;
import java.util.List;

public class C02_istenmeyenisimlerisil {
    public static void main(String[] args) {

        String [] arr = {"Mehmet" , "Ali" , "Veli" , "Deli" , "Zaihde", "Sapsik"};

        List<String> isimler2  = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            isimler2.add(arr[i]);
        }
        System.out.println(isimler2);

        System.out.println(istenmyen(isimler2, "e"));

        isimler2 = istenmyen(isimler2, "e");
    }

    public static List<String> istenmyen (List<String> isimler , String istenmeyenharf){

        List<String> yenilist = new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {
            
           if ( !isimler.get(i).contains(istenmeyenharf)){
               yenilist.add(isimler.get(i));
           }
        }

        return yenilist;

    }
}
