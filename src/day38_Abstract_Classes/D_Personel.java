package day38_Abstract_Classes;

public abstract class D_Personel {
    public abstract void standartMaas();
    public abstract void mesai();

    public abstract void yillikIzin();

    public void ozelSigorta(){
        System.out.println("Tum personel katki payi ile ozel sigorta yaptirabilir.");
    }
}
