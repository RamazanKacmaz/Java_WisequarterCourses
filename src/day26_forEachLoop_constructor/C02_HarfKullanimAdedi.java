package day26_forEachLoop_constructor;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf = "a";

        String [] sumlearr = cumle.split("");

        int sayac = 0;

        for (String each:sumlearr
             ) {
            if (each.equals(harf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("aradiginiz harf yokkkk");
        }else {
            System.out.println("aradiginiz harf " + sayac);
        }


    }
}
