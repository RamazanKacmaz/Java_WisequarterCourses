package day21_Arrays;

public class C04_ElementSay {
    public static void main(String[] args) {

        int [] arr = {3,5,2,3,5,6,7,1,8};
        int aranansayi= 5;
        elamansay(arr,aranansayi);
    }

    public static void elamansay(int [] arr , int arananSayi){
        int sayac = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == arananSayi){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("aranan sayi yokkk");
        }else {
            System.out.println("aranan sayi ="  + sayac + "kullanildi");
        }
    }
}
