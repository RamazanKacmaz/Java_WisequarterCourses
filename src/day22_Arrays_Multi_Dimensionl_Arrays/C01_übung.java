package day22_Arrays_Multi_Dimensionl_Arrays;

public class C01_übung {
    public static void main(String[] args) {

        String [] isimler = {"ayse" , "yusuf" , "bugra" , "abdullah" , "Nergiz"};
        int sayac = 0;
        int kelimeuzunlugu = 0;


        for (int i = 0; i < isimler.length ; i++) {

            kelimeuzunlugu = isimler[i].length();

            if (kelimeuzunlugu % 2 != 0){
                System.out.print(isimler[i] + " ");
                sayac++;
            }
        }
        System.out.println("\nToplam" + sayac+ "adet isim yazidirildi");
    }
}
