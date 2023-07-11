package day18_WhileLoop_DoWhileLoop_Scope;

public class C07_doWhileLoop {
    public static void main(String[] args) {

        int baslangic = 10 ;
        int bitis = 20;
        int toplm = 0;

        /*for (int i = baslangic; i <= bitis ; i++) {

            toplm += i ;
        }
        System.out.println("toplm " + toplm);*/

        while (baslangic <= bitis){
            toplm += baslangic;
            baslangic++;
        }
        System.out.println(toplm);


        baslangic = 10;
        bitis = 20;
        toplm = 0;

        do {
            toplm += baslangic;
            baslangic++;

        }while (baslangic <= bitis);
            System.out.println("toplm " + toplm);


    }
}
