package test.HIU;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 17:24
 * 数字阶梯求和
 * 给定a和n，计算a+aa+aaa+a...a(n个a)的和。
 */
public class SumOfLadderNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int a = scan.nextInt();
            int n = scan.nextInt();
            BigInteger sum = new BigInteger(String.valueOf(0));
            for (int i = 1; i <= n; i++) {
                BigInteger num = getNumByLength(a, i);
                sum = sum.add(num);
            }
            System.out.println(sum);
        }
    }

    private static BigInteger getNumByLength(int a, int length) {
        String s = String.valueOf(a);
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(s);
        }
        return new BigInteger(sb.toString());
    }
}
