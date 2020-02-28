package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/28 21:02
 */
public class Main002 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                int count = countYue(num);
                System.out.println(count);
            }
        }
    }

    private static int countYue(int num) {
        if (num == 1) {
            return 1;
        }
        int count = 0;
        int sqrt = (int) Math.sqrt(num);
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                int res = num / i;
                if (res == sqrt) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }
        return count;
    }
}
