package am.picsartacademy.homework1;

import java.util.HashMap;

public class Task3 {
//  3.	Student Grades
//	•	Map: HashMap<String, Integer> where key is student name and value is grade.
//  •	Print names of all students who scored above 80.

    public static void main(String[] args) {
        HashMap<String, Integer> studentGrades = new HashMap<>();

        studentGrades.put("Anna", 95);
        studentGrades.put("Ani", 88);
        studentGrades.put("Lilit", 76);
        studentGrades.put("David", 90);
        studentGrades.put("Hayk", 62);
        studentGrades.put("Mane", 54);
        studentGrades.put("Samvel", 99);
        studentGrades.put("Tigran", 24);

        System.out.println("Students with a grade above 80:");
        for (String name : studentGrades.keySet()) {
            if (studentGrades.get(name) > 80) {
                System.out.println(name);
            }

        }
    }
}
