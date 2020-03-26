package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/26 10:51
 */
public class Main053 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            // 记录奇数和偶数的个数
            int countOdd = 0, countEven = 0;
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (num == 0 || num % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            if (countEven > countOdd) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
