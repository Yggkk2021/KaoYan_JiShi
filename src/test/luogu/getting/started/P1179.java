package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/2 22:29
 */
public class P1179 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int start = scan.nextInt();
            int end = scan.nextInt();
            int res = 0;
            for (int i = start; i <= end; i++) {
                res += count2(i);
            }
            System.out.println(res);
        }
    }

    private static int count2(int num) {
        int sum = 0;
        char[] arr = String.valueOf(num).toCharArray();
        for (char c : arr) {
            if (c == '2') {
                sum++;
            }
        }
        return sum;
    }
}
