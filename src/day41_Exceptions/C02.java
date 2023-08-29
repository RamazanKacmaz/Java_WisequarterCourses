package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02 {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("day41_Exceptions/dosya.txt");

    }
}
