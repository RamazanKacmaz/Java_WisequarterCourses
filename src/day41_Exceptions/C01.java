package day41_Exceptions;

public class C01 {
    public static void main(String[] args) {
        try {
            int result = divide(10,0);
            System.out.println("Sonuc :" + result);
        }catch (ArithmeticException e){
            System.out.println("Bir aritmetik hata olustu" + e.getMessage());
        }
    }

    private static int divide(int dividend, int divisor) {
        return dividend/divisor;
    }
}
