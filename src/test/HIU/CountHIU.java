package test.HIU;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 16:46
 * 求1-n内的完数，所谓的完数是这样的数，它的所有因子相加等于它自身，比如6有3个因子1,2,3,1+2+3=6，
 * 那么6是完数。即完数是等于其所有因子（除了它自己）相加和的数
 */
public class CountHIU {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i <= n; i++) {
                if (isCount(i)) {
                    sb.append(i).append(" ");
                }
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }

    private static boolean isCount(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
