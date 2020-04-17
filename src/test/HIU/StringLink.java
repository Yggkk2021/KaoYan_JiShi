package test.HIU;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 17:11
 * 字符串连接
 */
public class StringLink {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 2; i++) {
                sb.append(scan.next());
            }
            System.out.println(sb.toString());
        }
    }
}
