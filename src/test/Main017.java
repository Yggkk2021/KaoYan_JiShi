package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/4 10:52
 */
public class Main017 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            List<Student> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String id = scan.next();
                String name = scan.next();
                String sex = scan.next();
                String age = scan.next();
                Student s = new Student(id, name, sex, age);
                list.add(s);
            }
            int searchTime = scan.nextInt();
            for (int i = 0; i < searchTime; i++) {
                String searchId = scan.next();
                Student student = search(searchId, list);
                if (student != null) {
                    System.out.println(student.getId() + " " + student.getName() + " " +
                        student.getSex() + " " + student.getAge());
                } else {
                    System.out.println("No Answer!");
                }
            }
        }
    }

    private static Student search(String id, List<Student> list) {
        for (Student s : list) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }
}

class Student {
    private String id;
    private String name;
    private String sex;
    private String age;

    public Student(String id, String name, String sex, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
