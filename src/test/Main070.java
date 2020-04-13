package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/13 22:02
 */
public class Main070 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            char[] str = scanner.nextLine().toCharArray();
            Arrays.sort(str);

            // 输出第一个排列
            System.out.println(new String(str));

            // 生成后序排列并输出
            while (true) {
                // 找出待交换位置的元素的位置+1
                int i = str.length - 1;
                while (i > 0 && str[i] < str[i - 1]) {
                    i--;
                }
                if (i <= 0) {
                    break;
                }

                // 剪枝：后边是一个倒序序列，没必要全部遍历
                int minRightPos = i;
                for (int j = i; j < str.length && str[j] > str[i - 1]; j++) {
                    minRightPos = j;
                }

                // 交换位置
                str[i - 1] ^= str[minRightPos];
                str[minRightPos] ^= str[i - 1];
                str[i - 1] ^= str[minRightPos];

                for (int m = i, n = str.length - 1; m < n; m++, n--) {
                    str[m] ^= str[n];
                    str[n] ^= str[m];
                    str[m] ^= str[n];
                }

                System.out.println(new String(str));
            }
            System.out.println();
        }
    }
}
