package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/31 22:33
 */
public class Main059 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String a = scan.next();
            String b = scan.next();

            BigInteger num1 = getNum(a);
            BigInteger num2 = getNum(b);
            System.out.println(num1.add(num2));
        }
    }

    private static BigInteger getNum(String s) {
        String[] arr = s.split(",");
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            sb.append(word);
        }
        return new BigInteger(sb.toString());
    }
}
