package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/29 17:07
 */
public class Main006 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int num = scan.nextInt();
            int sqrt = (int) Math.sqrt(num);
            int prime = 2;
            int count = 0;
            while (prime != -1 && prime != num) {
                if (num % prime == 0) {
                    num = num / prime;
                    count++;
                } else {
                    prime= getNextPrime(prime, sqrt);
                }
            }
            System.out.println(count + 1);
        }
    }

    private static int getNextPrime(int start, int num) {
        if (start < 2) {
            return 1;
        }
        if (start == 2) {
            return 3;
        }
        for (int i = start + 2; i <= num; i = i + 2) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isPrime(int num) {
        if (num == 1 || num % 2 == 0) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        int sqrt = (int) Math.sqrt(num);
        for (int i = 3; i <= sqrt; i = i + 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
