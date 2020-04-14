package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/14 22:00
 */
public class Main072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int sum1 = a + b;

                int aR = getReverse(a);
                int bR = getReverse(b);
                int sum2 = aR + bR;

                if (sum1 == getReverse(sum2)) {
                    System.out.println(sum1);
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static int getReverse(int n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        return Integer.valueOf(sb.reverse().toString());
    }
}
