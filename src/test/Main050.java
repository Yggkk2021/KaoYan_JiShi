package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/25 11:58
 */
public class Main050 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n > 10000) {
                n = 10000;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 11; i < n; i += 10) {
                if (isPrime(i)) {
                    sb.append(i).append(" ");
                }
            }
            if (sb.length() == 0) {
                System.out.println("-1");
            } else {
                System.out.println(sb.substring(0, sb.length() - 1));
            }
        }
    }
    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int j = 3; j <= sqrt; j += 2) {
            if (num % j == 0) {
                return false;
            }
        }
        return true;
    }
}
