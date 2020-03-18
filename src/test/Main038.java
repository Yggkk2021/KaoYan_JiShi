package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/18 10:55
 */
public class Main038 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int res = ladder(n);
            System.out.println(res);
        }
    }

    private static int ladder(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return ladder(n - 1) + ladder(n - 2);
    }
}
