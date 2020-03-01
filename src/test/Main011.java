package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/1 20:25
 */
public class Main011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                max = num > max ? num : max;
                min = num < min ? num : min;
            }
            System.out.println(max + " " + min);
        }
    }
}
