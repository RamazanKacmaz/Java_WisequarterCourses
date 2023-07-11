package day16_metodOlusturma_kullanma;

public class C01_metodOlusturma {

    public static void main(String[] args) {
       altString("java guzeldir", 3 , 7 );
       altString("Biraz sabir lütfen" , 5,4);
       altString("bu da mi gol degil", 11,33);

       String str = "aramiz bizulmasin";
       altString(str,5,10);

    }
    public static void altString (String metin ,int basIndex , int bitIndex){

        if (basIndex > bitIndex){
            System.out.println("baslangicindex bitis indexten buuyk olamaz");
        } else if (basIndex>=metin.length() || bitIndex>= metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
        }else {
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
    }

}
