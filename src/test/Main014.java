package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/2 19:54
 */
public class Main014 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();
            for (int i = 1; i < month; i++) {
                if (i == 2) {
                  if (isLeapYear(year)) {
                      day += 29;
                  } else {
                      day += 28;
                  }
                } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    day += 31;
                } else {
                    day += 30;
                }
            }
            System.out.println(day);

        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return year % 100 != 0 || year % 400 == 0;
        }
        return false;
    }
}
