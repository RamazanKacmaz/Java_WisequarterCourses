package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04 {
    public static void main(String[] args) {
        String dosyayolu = "src/day41_Exceptions/dosya.txt";

        try {
            FileInputStream fis =  new FileInputStream(dosyayolu);
            int k = 0;
            while ((k=fis.read()) != -1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("dosya okunamiyor");
        }
    }
}
