package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/29 17:12
 */
public class P1089 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int deposit = 0;
            int last = 0;
            for (int i = 1; i <= 12; i++) {
                int buget = scan.nextInt();
                int allMoney = last + 300;
                if (allMoney >= buget) {
                    int diff = allMoney - buget;
                    if (diff >= 100) {
                        int fac = diff / 100;
                        deposit += fac * 100;
                        last = allMoney - buget - fac * 100;
                    } else {
                        last = allMoney - buget;
                    }

                } else {
                    System.out.println(-i);
                    return;
                }
            }
            System.out.println(String.format("%.0f", deposit + last + deposit * 0.2));
        }
    }
}
