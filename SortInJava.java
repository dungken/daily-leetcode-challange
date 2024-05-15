import java.util.Arrays;
import java.util.Comparator;

public class SortInJava {
    static class Student implements Comparable<Student>{
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student other) {
            // compare this with other
            // 0 ? this = other
            // 1 ? this > other
            // -1 ? this < other
            return this.age - other.age;
        }
    }

    static class CompareStudentName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareTo(o2.name);
        }
    }


    public static void main(String[] args) {
        // Sort Arrays.sort() with integer
        int[] intArray = {5, 2, 1, 0, 9};
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        // Sort Arrays.sort() with string
        String[] stringArray = {"AAA", "BB", "C", "Z", "D"};
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        // Sort Arrays.sort() with comparable - compareTo + Sort Arrays.sort() with comparator - compare
        Student[] students = {new Student(22, "Ha Van Dung"), new Student(21, "Nguyen Van Thang")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new CompareStudentName());
        System.out.println(Arrays.toString(students));
    }
}
