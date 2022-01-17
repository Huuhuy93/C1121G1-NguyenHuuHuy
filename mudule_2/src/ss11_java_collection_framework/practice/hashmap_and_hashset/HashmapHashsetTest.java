package ss11_java_collection_framework.practice.hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashmapHashsetTest {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Nam",20, "HN");
        Student1 student2 = new Student1("Hung",22, "HN");
        Student1 student3 = new Student1("Ha",21, "HN");

        Map<Integer, Student1> studentMap = new HashMap<Integer, Student1>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);

        for (Map.Entry<Integer, Student1> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...........Set");

        Set<Student1> student1s = new HashSet<Student1>();
        student1s.add(student1);
        student1s.add(student2);
        student1s.add(student3);
        student1s.add(student1);

        for (Student1 student: student1s) {
            System.out.println(student.toString());
        }

    }
}
