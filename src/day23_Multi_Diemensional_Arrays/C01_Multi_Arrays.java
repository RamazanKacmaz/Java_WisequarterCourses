package day23_Multi_Diemensional_Arrays;

public class C01_Multi_Arrays {
    public static void main(String[] args) {

        int [] arrTek = {3,7,1,9};

        int toplam = 0;

        for (int i = 0; i <arrTek.length ; i++) {

            toplam += arrTek[i];

        }
        System.out.println(toplam);

        int [][] sayilar = {{1, 2, 5}, {7, 4}, {9}, {3, 0, 1}};

        toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {
            for (int j = 0; j < sayilar[i].length ; j++) {
                toplam += sayilar[i][j];
            }
        }

        System.out.println(toplam);


    }
}
