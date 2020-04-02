package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/2 22:41
 */
public class Main063 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int sum = 0;
            int a = -1;
            int[] arr = new int[6];
            boolean getA = false;
            String str = scan.nextLine();
            String[] arrStr = str.split(" ");
            for (int i = 0; i < arrStr.length; i++) {
                int num = Integer.valueOf(arrStr[i]);
                arr[i] = num;
                if (num > 0 && !getA) {
                    getA = true;
                    a = num;
                }
            }
            for (int i : arr) {
                if (i < a) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
