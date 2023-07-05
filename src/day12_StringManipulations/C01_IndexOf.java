package day12_StringManipulations;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Ali topu at,at topu at";

        System.out.println(str.indexOf("top"));

        System.out.println(str.indexOf("top",5));

        System.out.println(str.indexOf("top",str.indexOf("top")+1));

        System.out.println("__________________________________");
        int ilkindex = str.indexOf("at");
        if (ilkindex == -1){
            System.out.println("iki kere kullanilmamis");
        }else {
            System.out.println("en az bir kere 'at' kullanilmistir.");
            int ikinciindex = str.indexOf("at",ilkindex+1);
            if (ikinciindex == -1){
                System.out.println("Sadece bir kere kullanilmis");
            }else {
                System.out.println("birkac gez vardir..");
            }
        }



    }
}
