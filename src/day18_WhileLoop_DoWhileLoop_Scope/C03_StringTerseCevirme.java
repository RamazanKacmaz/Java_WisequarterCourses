package day18_WhileLoop_DoWhileLoop_Scope;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {

        System.out.println(metnitersecevir("Bu is bu kadar."));

    }

    public static String metnitersecevir (String metin){

        String tersMetin = "" ;

        int index = metin.length()-1;

        while (index>=0){
           tersMetin += metin.charAt(index);
           index--;

        }
        return tersMetin;
    }
}
