package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/25 9:01
 */
public class Main049 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            if (isShouXing(n)) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }

    private static boolean isShouXing(int n) {
        int len = String.valueOf(n).length();
        String pow = String.valueOf(n * n);
        String last = pow.substring(pow.length() - len, pow.length());
        if (last.equals(String.valueOf(n))) {
            return true;
        }
        return false;
    }
}
