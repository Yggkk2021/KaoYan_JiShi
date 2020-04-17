package test.HIU;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 16:39
 * 给定三角形的三条边，a,b,c。判断该三角形类型
 */
public class DetermineTheTypeOfTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int[] line = new int[3];
            for (int i = 0; i < line.length; i++) {
                int num = scan.nextInt();
                line[i] = num;
            }
            Arrays.sort(line);
            int min = line[0], mid = line[1], max = line[2];
            if (min * min + mid * mid == max * max) {
                System.out.println("直角三角形");
            } else if (min * min + mid * mid < max * max) {
                System.out.println("钝角三角形");
            } else {
                System.out.println("锐角三角形");
            }
        }
    }
}
