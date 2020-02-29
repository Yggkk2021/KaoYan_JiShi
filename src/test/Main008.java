package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/29 18:07
 */
public class Main008 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[n];

            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                arr[i] = a;
                brr[i] = b;
            }

            // 先对成绩排序
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (brr[j] > brr[j + 1]) {
                        int temp1 = brr[j];
                        brr[j] = brr[j + 1];
                        brr[j + 1] = temp1;

                        int temp2 = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp2;
                    }
                }
            }

            // 如果分数相同对学号排序
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (brr[j] == brr[j + 1]) {
                        if (arr[j] > arr[j + 1]) {
                            int temp1 = brr[j];
                            brr[j] = brr[j + 1];
                            brr[j + 1] = temp1;

                            int temp2 = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp2;
                        }
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " " + brr[i]);
            }
        }
    }
}
