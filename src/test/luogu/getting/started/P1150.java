package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/1 21:06
 */
public class P1150 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int k = scan.nextInt();

            int smokeCount = 0;
            for (int i = 0; i < n; i++) {
                smokeCount++;
                if (smokeCount == k) {
                    n++;
                    smokeCount = 0;
                }
            }
            System.out.println(n);
        }
    }
}
