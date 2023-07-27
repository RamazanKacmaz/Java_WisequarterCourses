package day30_Local_Time;

import java.time.LocalTime;

public class C01_Local_Time {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.minusHours(100));
        System.out.println(time.plusSeconds(1000));
        System.out.println(time.withHour(15));
        LocalTime time1 = LocalTime.of(12,35);
        LocalTime time2 = LocalTime.of(14,34);


    }
}
