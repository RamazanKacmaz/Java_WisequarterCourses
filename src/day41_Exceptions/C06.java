package day41_Exceptions;

public class C06 {
    public static void main(String[] args) {
        int sayi =11;

        try {
            if (sayi% 2 == 0){
                throw  new RuntimeException();
            }
            System.out.println("kod satiri 1");
            System.out.println("kod satiri 2");
            System.out.println("kod satiri 3");
        }catch (RuntimeException e){
            System.out.println("Sayi cift ilk 3 satir atlandi");
        }
        System.out.println("kod satiri 4");
        System.out.println("kod satiri 5");
    }
}
