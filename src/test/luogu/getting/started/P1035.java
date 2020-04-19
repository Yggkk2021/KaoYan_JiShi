package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/19 16:10
 * 级数求和
 */
public class P1035 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            double sum = 0;
            double res;
            double k = 1;
            while (true) {
                sum += 1 / k;
                if (sum > n) {
                    res = k;
                    break;
                }
                k++;
            }
            System.out.println(String.format("%.0f", res));
        }
    }
}
