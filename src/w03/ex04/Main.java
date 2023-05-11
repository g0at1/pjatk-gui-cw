package w03.ex04;

import java.util.Arrays;
import java.util.Comparator;

public
    class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Jan", 2654);
        Student s2 = new Student("Ola", 78932);
        Student s3 = new Student("Tomasz", 534);

        Student[] students = new Student[]{ s1, s2, s3};

        for(Student student : students)
            System.out.println(student);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getIndexNumber() - o2.getIndexNumber();
            }
        });

        System.out.println("==========================");

        for(Student student : students)
            System.out.println(student);
    }
}
