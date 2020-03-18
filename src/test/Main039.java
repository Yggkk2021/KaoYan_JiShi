package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/18 11:00
 */
public class Main039 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int res = getMaxYue(a, b);
            System.out.println(res);
        }
    }

    private static int getMaxYue(int max, int min) {
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        if (max % min == 0) {
            return min;
        }
        for (int i = min / 2; i >= 1; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
