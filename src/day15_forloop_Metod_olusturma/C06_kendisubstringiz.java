package day15_forloop_Metod_olusturma;

public class C06_kendisubstringiz {

    public static void main(String[] args) {
        
        String str = "Java Candir";
        
        int bslangic = 3;
        
        int bitis = 7;
        
        if (bslangic > bitis){
            System.out.println("baslangiv deggeri bitis degeriden buyuk olamaz");
        } else if (bslangic<0 || bitis < 0  || bslangic > str.length() || bitis>=str.length()) {
            System.out.println("indexler hatali");
        }else {
            for (int i = bslangic; i <bitis ; i++) {
                System.out.println(str.charAt(i));
            }
        }


        System.out.println(str.substring(bslangic,bitis));


    }
}
