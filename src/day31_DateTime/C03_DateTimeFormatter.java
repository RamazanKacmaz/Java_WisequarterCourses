package day31_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();

        System.out.println(tarihSaat);


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd / MM / YYYY");
        System.out.println(tarihSaat.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH : MM  a ");

        System.out.println(tarihSaat.format(dtf2));
    }
}
