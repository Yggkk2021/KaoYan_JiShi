package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/15 20:18
 */
public class Main074 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            List<Employee> list = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                int id = scan.nextInt();
                String name = scan.next();
                int age = scan.nextInt();
                Employee employee = new Employee(id, name, age);
                list.add(employee);
                Collections.sort(list, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        if (o1.getAge() == o2.getAge()) {
                            if (o1.getId() == o2.getId()) {
                                return o1.getName().compareTo(o2.getName());
                            } else {
                                return Integer.compare(o1.getId(), o2.getId());
                            }
                        } else {
                            return Integer.compare(o1.getAge(), o2.getAge());
                        }
                    }
                });
            }
            int min = n < 3 ? n : 3;
            for (int i = 0; i < min; i++) {
                Employee e = list.get(i);
                System.out.println(e.getId() + " " + e.getName() + " " + e.getAge());
            }
        }
    }
}

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
