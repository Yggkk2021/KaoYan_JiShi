package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/9 21:39
 */
public class Main065 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.next();
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
