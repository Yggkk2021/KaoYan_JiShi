package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/28 19:57
 * 清华大学-查找和排序
 */
public class Main001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int flag = scan.nextInt();

            List<Grade> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String name = scan.next();
                int grade = scan.nextInt();
                Grade g = new Grade(name, grade);
                list.add(g);
            }
            if (flag == 1) {
                list.sort((o1, o2) -> {
                    if (o1.getGrade() > o2.getGrade()) {
                        return 1;
                    } else if (o1.getGrade() < o2.getGrade()) {
                        return -1;
                    } else {
                        return 0;
                    }
                });
            } else {
                list.sort((o1, o2) -> {
                    if (o1.getGrade() < o2.getGrade()) {
                        return 1;
                    } else if (o1.getGrade() > o2.getGrade()) {
                        return -1;
                    } else {
                        return 0;
                    }
                });
            }

            for (Grade g : list) {
                System.out.println(g.getName() + " " + g.getGrade());
            }
        }
    }
}



class Grade {
    private String name;
    private Integer grade;

    Grade(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
