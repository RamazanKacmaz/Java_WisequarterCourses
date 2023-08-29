package day44_Maps;

import java.util.HashMap;
import java.util.Map;

public class mapcalisma {
    public static void main(String[] args) {

        Map<String  , Integer> studentGrades = new HashMap<>();

        studentGrades.put("Ahmet" , 85);
        studentGrades.put("Mehmet" , 92);
        studentGrades.put("Ayse" , 78);

        int ahmetgrade = studentGrades.get("Ahmet");

        System.out.println("Ahmedin notu : " + ahmetgrade);
        System.out.println("________________________________");

        for (String student:studentGrades.keySet()
             ) {
            System.out.println("Ogrenci : " + student);
        }

        System.out.println("____________________________");

        for (int grade:studentGrades.values()
             ) {
            System.out.println("Not : " + grade);
        }
        System.out.println("_____________________________");

        for (Map.Entry<String , Integer> entry: studentGrades.entrySet()
             ) {
            String student = entry.getKey();
            int grade = entry.getValue();

            System.out.println(student + " -> " + grade);
        }
    }
}
