package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Student a = new Student(sc.nextInt(), sc.next(), sc.nextDouble());
            arr.add(a);
        }

        Collections.sort(arr, new Student());
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getName());
        }
    }

    static class Student implements Comparator<Student> {
        int id;
        String name;
        double mark;

        public Student() {
        }

        public Student(int id, String name, double mark) {
            this.id = id;
            this.name = name;
            this.mark = mark;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getMark() {
            return mark;
        }

        public int compare(Student a, Student b) {
            if (a.getMark() < b.getMark()) {
                return 1;
            } else if (a.getMark() > b.getMark()) {
                return -1;
            } else {
                if (a.getName().compareTo(b.getName()) > 0) {
                    return 1;
                } else if (a.getName().compareTo(b.getName()) < 0) {
                    return -1;
                } else {
                    if (a.getId() > b.getId()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }
}
