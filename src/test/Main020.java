package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/6 11:01
 */
public class Main020 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (n == 0) {
                break;
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    int a = arr[i];
                    int b = arr[j];
                    if (f(a, b)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    /**
     * 判断是否有最小公因数
     * @param min
     * @param max
     * @return
     */
    private static boolean f(int min, int max) {
        for (int i = 2; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                return false;
            }
        }
        return true;
    }
}
