package test.HIU;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 16:20
 * 用小于等于n元去买100只鸡，大鸡5元/只，小鸡3元/只,还有1/3元每只的一种小鸡，
 * 分别记为x只,y只,z只。编程求解x,y,z所有可能解。
 */
public class HundredChickenProblem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            // 一种多少钱
            int n = scan.nextInt();
            for (int i = 0; i <= n / 5; i++) {
                for (int j = 0; j < n / 3; j++) {
                    for (double k = 0; k <= 3 * n; k++) {
                        if (i + j + k == 100 && k / 3 + j * 3 + i * 5 <= n) {
                            System.out.println("x=" + i + ",y=" + j + ",z=" + k);
                        }
                    }
                }
            }
        }
    }
}
