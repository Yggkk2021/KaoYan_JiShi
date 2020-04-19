package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/19 16:23
 * 校门外的树
 */
public class P1047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int len = scan.nextInt();
            int[] arr = new int[len + 1];
            int part = scan.nextInt();

            for (int i = 0; i < part; i++) {
                int start = scan.nextInt();
                int end = scan.nextInt();
                for (int j = start; j <= end; j++) {
                    arr[j] = 1;
                }
            }
            int sumTree = 0;
            for (int i : arr) {
                if (i != 1) {
                    sumTree++;
                }
            }
            System.out.println(sumTree);
        }
    }
}
