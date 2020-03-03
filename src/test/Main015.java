package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/3 20:00
 */
public class Main015 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            System.out.println(getMaxSum(arr));
        }
    }
    
    private static int getMaxSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int anArr : arr) {
            sum += anArr;
            max = sum > max ? sum : max;
            sum = sum < 0 ? 0 : sum;
        }
        return max;
    }
}
