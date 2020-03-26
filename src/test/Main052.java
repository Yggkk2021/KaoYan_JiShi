package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/26 10:06
 */
public class Main052 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String line = scan.nextLine();
            line = line.substring(0, line.length() - 1);
            String[] arr = line.split(" ");

            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s.length()).append(" ");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
