package test.luogu.getting.started;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/20 14:36
 * 质因数分解
 */
public class P1075 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();

            List<Integer> list = new LinkedList<>();
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    list.add(i);
                    list.add(n / i);
                }
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                int fac = list.get(i);
                if (isPrime(fac)) {
                    System.out.println(fac);
                    break;
                }
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
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
