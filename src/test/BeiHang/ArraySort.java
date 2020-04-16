package test.BeiHang;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/16 16:40
 * 数组排序
 */
public class ArraySort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int minA = Integer.MAX_VALUE;
            int minB = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                if (a < minA) {
                    minA = a;
                    minB = b;
                } else if (a == minA && b < minB) {
                    minB = b;
                }
            }
            System.out.println(minA + " " + minB);
        }
    }
}
