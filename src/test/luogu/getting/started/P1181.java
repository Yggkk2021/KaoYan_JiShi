package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/3 12:03
 */
public class P1181 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            int start = 0;
            int count = 0;
            while (start <= arr.length) {
                start = getNewStart(arr, start, m);
                count++;
            }
            System.out.println(count);
        }
    }

    private static int getNewStart(int[] arr, int start, int m) {
        int sum = 0;
        for (int i = start; i < arr.length; i++) {
            sum += arr[i];
            if (sum > m) {
                return i;
            }
        }
        return arr.length + 1;
    }
}
