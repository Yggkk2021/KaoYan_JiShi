package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/28 22:54
 */
public class Main004 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.next();
            StringBuilder sb = new StringBuilder();
            char[] arr = str.toCharArray();
            for (int i = str.length() - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
            System.out.println(sb.toString());
        }
    }
}
