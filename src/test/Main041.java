package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/19 10:37
 */
public class Main041 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int year = scan.nextInt();
            int countDay = scan.nextInt();
            calculateDates(year, countDay);
        }
    }

    /**
     * 判断是不是闰年
     * @param year 年份
     * @return 是否
     */
    private static boolean isRun(int year) {
        return year % 4 == 0 && (year % 100 == 0 && year % 400 == 0 || year % 100 != 0
                || year % 400 == 0);
    }

    private static void calculateDates(int year, int countDay) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        int countMonth = 1;

        for (int i = 1; i <= 12; i++) {
            int d;
            if (i == 2) {
                if (isRun(year)) {
                    d = 29;
                } else {
                    d = 28;
                }
            } else {
                d = map.get(i);
            }
            if (countDay > d) {
                countDay = countDay - d;
                countMonth++;
            } else {
                String month;
                String day;
                if (countMonth >= 10) {
                    month = String.valueOf(countMonth);
                } else {
                    month = String.valueOf("0" + countMonth);
                }
                if (countDay < 10) {
                    day = String.valueOf("0" + countDay);
                } else {
                    day = String.valueOf(countDay);
                }
                System.out.println(year + "-" + month + "-" + day);
                return;
            }
        }
    }
}
