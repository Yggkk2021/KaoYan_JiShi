package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/19 16:19
 * 陶陶摘苹果
 */
public class P1046 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int[] arr = new int[10];

            for (int i = 0; i < 10; i++) {
                int num = scan.nextInt();
                arr[i] = num;
            }
            int count = 0;
            int height = scan.nextInt() + 30;
            for (int i : arr) {
                if (i <= height) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
