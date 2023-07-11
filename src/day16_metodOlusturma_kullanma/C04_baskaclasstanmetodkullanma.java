package day16_metodOlusturma_kullanma;

public class C04_baskaclasstanmetodkullanma {

    public static void main(String[] args) {

        C01_metodOlusturma.altString("method", 1, 3);

        C03_MethodOlusturma.isimDuzenle("bugra", "can");
        String isimduzenle = C03_MethodOlusturma.isimDuzenle("mehmet","kemal");

        System.out.println(isimduzenle.length());
    }
}
