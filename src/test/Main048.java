package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/24 11:16
 */
public class Main048 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String[] arr = scan.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            System.out.println(sb.toString());
        }
    }
}
