package day25_ArrayList_For_each_Loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Array_List {
    public static void main(String[] args) {

        System.out.println(listolustur());

    }
    public static List<String> listolustur(){
        Scanner scanner ;
        String girilenisim;
        List<String> isimlist = new ArrayList<>();

        do {
           scanner = new Scanner(System.in);
            System.out.println("Listeye eklemek icinisim giriniz, \n bitirmek icin Q basin");
            girilenisim = scanner.nextLine();
            if (!girilenisim.equalsIgnoreCase("Q")){
                isimlist.add(girilenisim);
            }
        }while (!girilenisim.equalsIgnoreCase("Q") );
        return isimlist;
    }
}
