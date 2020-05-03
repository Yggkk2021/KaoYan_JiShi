package test.luogu.getting.started;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/1 21:09
 */
public class P1151 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int k = scan.nextInt();
            List<Integer> list = new LinkedList<>();
            for (int i = 10000; i <= 30000; i++) {
                int a = Integer.parseInt(String.valueOf(i).substring(0, 3));
                int b = Integer.parseInt(String.valueOf(i).substring(1, 4));
                int c = Integer.parseInt(String.valueOf(i).substring(2, 5));
                if (a % k == 0 && b % k == 0 && c % k == 0) {
                    list.add(i);
                }
            }
            if (list.isEmpty()) {
                System.out.println("No");
            } else {
                for (int i : list) {
                    System.out.println(i);
                }
            }
        }
    }
}
