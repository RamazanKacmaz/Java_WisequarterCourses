package day09_Nested_TernaryOperators_Swich;

import java.util.Scanner;

public class C02_IndirimHessplama {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Aldiginiz urun adedi :");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urün Liste faiati yaziniz :");
        int listeFiati = scanner.nextInt();

        System.out.println("Müsteri kartiniz var mi : Varsa E , yoksa H ");
        char müsteriKarti = scanner.next().charAt(0);

        if (müsteriKarti == 'E'){// Karti olanlar
            if (urunAdedi > 10){
                System.out.println("%20 indirimli toplam fiat" + urunAdedi* listeFiati*80/100);
            }else {
                System.out.println("%15 indirimli toplam fiat" + urunAdedi* listeFiati*85/100);
            }

            } else if (müsteriKarti == 'H') {// karti yoksa
            if (urunAdedi > 10){
                System.out.println("%15 indirimli toplam fiat" + urunAdedi* listeFiati*85/100);
            }else {
                System.out.println("%10 indirimli toplam fiat" + urunAdedi* listeFiati*90/100);
            }

        }else {
            System.out.println("Kart biligisi hatali");
    }
    }
}
