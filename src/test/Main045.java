package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/21 10:55
 */
public class Main045 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            BigInteger a = new BigInteger(scan.next());
            BigInteger b = new BigInteger(scan.next());
            System.out.println(a.add(b));
        }
    }
}

