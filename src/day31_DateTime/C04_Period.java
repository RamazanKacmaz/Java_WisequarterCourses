package day31_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumgunu = LocalDate.of(2018,8,8);
        LocalDate bugun = LocalDate.now();

        System.out.println(Period.between(dogumgunu, bugun));
    }
}
