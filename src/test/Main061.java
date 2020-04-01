package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/1 22:53
 */
public class Main061 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student61> list = new ArrayList<>();
        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                String name = scan.next();
                int age = scan.nextInt();
                int grade = scan.nextInt();

                Student61 student = new Student61(name, age, grade);
                list.add(student);
            }
            Collections.sort(list);

            for (Student61 s : list) {
                System.out.println(s.getName() + " " + s.getAge() + " " + s.getGrade());
            }
        }
    }
}

class Student61 implements Comparable<Student61> {

    String name;
    int age;
    int grade;

    public Student61(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student61 s) {
        if( this.getGrade() == s.getGrade()) {
            if( this.getName().compareTo(s.getName()) == 0) {
                return this.getAge() - s.getAge();
            } else {
                return this.getName().compareTo(s.getName());
            }
        } else {
            return this.getGrade() - s.getGrade();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
