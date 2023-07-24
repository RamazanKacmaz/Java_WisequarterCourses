package day26_forEachLoop_constructor;

public class C01_for_Each {
    public static void main(String[] args) {

        int [] arr = {3,6,9,1,3,7,12,34,23,87,32,43};

        int enbuuykelment = arr[0];

        for (int each: arr
             ) {

            if (each > enbuuykelment){
                enbuuykelment = each;
            }

        }

        System.out.println("en buyuk" + enbuuykelment);

    }
}
