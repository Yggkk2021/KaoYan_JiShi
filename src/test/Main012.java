package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/1 20:38
 */
public class Main012 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            BigInteger res = new BigInteger(String.valueOf(1));
            for (int i = 1; i <= n; i++) {
                res = res.multiply(BigInteger.valueOf(i));
            }
            System.out.println(res);
        }
    }
}
