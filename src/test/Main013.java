package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/2 19:44
 */
public class Main013 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s1 = scan.next();
            String s2 = scan.next();
            int[] arr = getArr(s1);
            int[] brr = getArr(s2);
            
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < brr.length; j++) {
                    sum += arr[i] * brr[j];
                }
            }
            System.out.println(sum);
        }
    }

    private static int[] getArr(String s) {
        int len = s.length();
        int[] res = new int[len];
        char[] arr = s.toCharArray();
        for (int i = 0; i < len; i++) {
            int num = arr[i] - '0';
            res[i] = num;
        }
        return res;
    }
}
