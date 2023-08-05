package day33_encapsulation_inheritance;

public class C04_Okul {
    private String okulAdi = "Yildiz Koleji";
    private int ogrencikaydi = 234;
    public String okulAdresi ="Ankara";



    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public int getOgrencikaydi() {
        return ogrencikaydi;
    }

    public void setOgrencikaydi(int ogrencikaydi) {
        this.ogrencikaydi = ogrencikaydi;
    }
}
