package day41_Exceptions;

public class C05 {
    public static void main(String[] args) {
        String str = "Java icin  bulunan sonuc sayisi : 4567 , listelenen sonux sayisi : 25";
        String [] kelimeler = str.split(" ");

        String sonucsaysi = kelimeler[7];

        sonucsaysi = sonucsaysi.replaceAll("\\D", "");

        int sonuc = Integer.parseInt(sonucsaysi);

        System.out.println(sonuc);
    }


}
