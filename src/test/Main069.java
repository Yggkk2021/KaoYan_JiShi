package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/13 21:59
 */
public class Main069 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.next();
            char[] arr = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
