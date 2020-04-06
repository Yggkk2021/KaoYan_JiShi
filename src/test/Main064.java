package test;

import java.util.Scanner;
import javax.sql.DataSource;

/**
 * @author yangshunfan 2020/4/6 22:19
 */
public class Main064 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String first = scan.next();
            String second = scan.next();
            if (first.compareTo(second) < 1) {
                String temp = first;
                first = second;
                second = temp;
            }
            int a = getDay(first);
            int b = getDay(second);
            System.out.println(Math.abs(a - b) + 1);
        }
    }

    public static int getDay(String t){
        int year = Integer.parseInt(t.substring(0, 4));
        int month = Integer.parseInt(t.substring(4, 6));
        int day = Integer.parseInt(t.substring(6, 8));
        int[] n={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] k={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum=0;
        for (int i = 1; i < year; i++) {
            if (year % 400==0 || (year % 100 != 0 && year % 4 == 0)){
                sum += 366;
            } else {
                sum += 365;
            }
        }
        for (int j = 0; j < month - 1; j++) {
            if (year % 400 ==0 || (year % 100 != 0 && year % 4 == 0)) {
                sum += k[j];
            } else {
                sum += n[j];
            }
        }
        sum += day;
        return sum;
    }
}

