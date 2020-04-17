package test.HIU;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 16:32
 * 输入一个数n，然后输入n个数值各不相同，调换数组中最大和最小的两个数，然后输出。
 */
public class MaxAndMinOfInterchange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            int min = Integer.MAX_VALUE;
            int minIndex = 0;

            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                arr[i] = num;
                if (num > max) {
                    max = num;
                    maxIndex = i;
                }
                if (num < min) {
                    min = num;
                    minIndex = i;
                }
            }
            arr[maxIndex] = min;
            arr[minIndex] = max;
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
