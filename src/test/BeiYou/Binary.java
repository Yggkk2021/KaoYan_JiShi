package test.BeiYou;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/18 17:32
 * 二进制
 */
public class Binary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                String s = Integer.toBinaryString(num);
                System.out.println(s);
            }
        }
    }
}
