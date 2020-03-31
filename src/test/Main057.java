package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/29 22:56
 */
public class Main057 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int num = scan.nextInt();
            if (isPrime(num)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean isPrime(int num) {

        if (num % 2 == 0 || num < 2) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
