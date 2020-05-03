package test.BeiYou;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/2 22:37
 */
public class BinaryReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            long num = scan.nextLong();
            String binary = Long.toBinaryString(num);
            String reverse = getReverse(binary);
            System.out.println(binary);
            System.out.println(reverse);
            long res = Long.parseLong(reverse, 2);
            System.out.println(res);
        }
    }

    private static String getReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
