package test.HIU;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 17:32
 * 输入10个整数，要求输出其中的最大值。
 */
public class FindMaxNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            BigInteger max = new BigInteger(scan.next());
            for (int i = 0; i < 9; i++) {
                BigInteger num = new BigInteger(scan.next());
                if (max.compareTo(num) < 0) {
                    max = num;
                }
            }
            System.out.println("max=" + max);
        }
    }
}
