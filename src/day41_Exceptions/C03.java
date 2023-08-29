package day41_Exceptions;

import java.net.SocketTimeoutException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        String str = "Ramo aboooooooooo";
        int [] arr = {3,5,7,9,8,4,6,};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Index numrasi giriniz");
        int index = 0;
        /*try {
            index = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("sayi  yaz");
        }

        try {
            System.out.println(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index string disinda");
        }

        try {
            System.out.println(arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index arr diisnda");
        }

       try {
           index = scanner.nextInt();
           System.out.println(str.charAt(index));
           System.out.println(arr[index]);
       }catch (InputMismatchException e){
           System.out.println("sayi  yaz");
       }catch (StringIndexOutOfBoundsException e){
           System.out.println("index string disinda");
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Index arr diisnda");
       }*/

        try {
            index = scanner.nextInt();
            System.out.println(str.charAt(index));
            System.out.println(arr[index]);
        } catch (RuntimeException e) {
            System.out.println("Kod calisirken hata olustu");
            e.printStackTrace();
        }

    }
}
