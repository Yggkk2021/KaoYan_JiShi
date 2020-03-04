package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/4 10:46
 */
public class Main016 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            BigInteger fac = getFactorial(n);
            System.out.println(fac);
        }
    }

    private static BigInteger getFactorial(int num) {
        BigInteger res = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
