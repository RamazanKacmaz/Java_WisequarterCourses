package day23_Multi_Diemensional_Arrays;

public class C05_Sonindextekielementlerintoplami {
    public static void main(String[] args) {

        int [][] sayilar = {{3, 4, 5}, {1, 4}, {5, 2, 7}, {1, 9, 0, 3}};

        sonelementleritopla(sayilar);


        char arr[] = new char[3];
        arr[0] ='A';
        arr[1] = 'L';
        arr[2] = 'I';

        for (int i = 2; i > 0 ; i--) {
            System.out.println(arr[i]);
        }

    }

    public static void sonelementleritopla (int [][] sayilar){

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {
            toplam += sayilar[i][sayilar[i].length-1];
        }
        System.out.println(toplam);
    }
}
