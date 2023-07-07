package day14_ForLoop_Nested_forLoop;

import java.util.Scanner;

public class C02_übung2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri pozitif tam sayi giriniz");

        int baskabgic = scanner.nextInt();

        System.out.println("Lutfen bitis degeri pozitif bir ram sayi giriniz");
        int bitis = scanner.nextInt();

        if (bitis < baskabgic){
            System.out.println("Baslangic degeri bubuk olamaz");
        }else {
            int toplam = 0;

            for (int i = baskabgic; i <= bitis  ; i++) {
                toplam += i;
            }
            System.out.println("sinirlar arasindaki tamsayilarin tolami " + toplam);
        }
    }
}
