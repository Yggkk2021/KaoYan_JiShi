package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/20 9:46
 */
public class Main042 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int max = arr[n - 1];
            System.out.println(max);
            if (n <= 1) {
                System.out.println("-1");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n - 1; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
