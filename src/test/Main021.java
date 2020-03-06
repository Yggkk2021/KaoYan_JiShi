package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/6 11:14
 */
public class Main021 {

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
            int mid;
            if (n % 2 == 0) {
                mid = (arr[n / 2] + arr[n / 2 - 1]) / 2;
            } else {
                mid = arr[n / 2];
            }
            System.out.println(mid);
        }
    }
}
