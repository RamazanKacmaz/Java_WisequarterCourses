package day31_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {
    public static void main(String[] args) {

        LocalDate tarih1 = LocalDate.now();
        System.out.println(tarih1);

        System.out.println(tarih1.getMonth());
        System.out.println(tarih1.getDayOfMonth());

        System.out.println(tarih1.isLeapYear());

        LocalDate tarih2 = LocalDate.of(2016,1,1);
        System.out.println(tarih1.withYear(2022));
        System.out.println(tarih1.minusYears(3).minusDays(53));

        System.out.println(tarih1.lengthOfMonth());


    }
}
