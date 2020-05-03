package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/3 18:39
 */
public class P1200 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String star = scan.next();
            String group = scan.next();

            if (getNum(star) % 47 == getNum(group) % 47) {
                System.out.println("GO");
            } else {
                System.out.println("STAY");
            }
        }
    }

    private static int getNum(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int sum = 1;
        for (char c : arr) {
            sum = sum * ((int) c - 96);
        }
        return sum;
    }
}
