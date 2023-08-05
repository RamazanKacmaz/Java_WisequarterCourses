package day33_encapsulation_inheritance;

public class C01_Pazarlama {
       private int toplamSatis;
       private int satis;

       public int getToplamSatis() {
              return toplamSatis;
       }

       public void setSatis(int satis) {
              this.satis = satis;
              toplamSatis += satis;
       }
}
