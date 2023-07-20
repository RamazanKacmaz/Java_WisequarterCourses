package day23_Multi_Diemensional_Arrays;

public class C03_ArraydakiEnbuyukveenkucuksayilariyazdirma {
    public static void main(String[] args) {

        int[][] arr = {{3, 6, 8}, {2, 5, 9}, {1, 3}, {12, 23, 24}};
        enbuuykenkucukyazdir(arr);

    }

    public static void enbuuykenkucukyazdir(int[][] arr){
        int enkucuksayi = arr[0][0];
        int enbuyuk = arr[0][0];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] < enkucuksayi){
                    enkucuksayi = arr[i][j];
                }
                if (arr[i][j] > enbuyuk){
                    enbuyuk = arr[i][j];
                }
            }

        }
        System.out.println(enkucuksayi );
        System.out.println(enbuyuk);

    }
}
