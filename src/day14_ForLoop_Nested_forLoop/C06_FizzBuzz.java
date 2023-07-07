package day14_ForLoop_Nested_forLoop;

import java.util.Scanner;

public class C06_FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz : ");

        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi ; i++) {
            if (i % 3 == 0 && i% 5 == 0){
                System.out.println("fizzBuzz\n");
            } else if (i % 3 == 0 ) {
                System.out.println("fizz ");
            } else if (i % 5 == 0) {
                System.out.println("buzz ");
            }else {
                System.out.println(i + " ");
            }
        }
    }
}
