package heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapInJava {
    public static class Student implements Comparable{
        private int age;
        private String name;
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Object o) {
            Student other = (Student) o;
            return Integer.compare(this.age, other.age);
        }
    }
    public static void main(String[] args) {
        Queue<Student> listStudent = new PriorityQueue<>(Comparator.reverseOrder());
        listStudent.add(new Student(10, "A"));
        listStudent.add(new Student(11, "B"));
        listStudent.add(new Student(9, "C"));
        while(!listStudent.isEmpty()) {
            Student st = listStudent.poll();
            System.out.println(st.name + " " + st.age);
        }
    }
}
