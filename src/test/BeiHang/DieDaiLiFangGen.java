package test.BeiHang;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/16 16:36
 */
public class DieDaiLiFangGen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int countOdd = 0;
            int countEven = 0;

            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (num % 2 == 0) {
                    countEven++;
                } else {
                    countOdd++;
                }
            }
            if (countEven > countOdd) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
