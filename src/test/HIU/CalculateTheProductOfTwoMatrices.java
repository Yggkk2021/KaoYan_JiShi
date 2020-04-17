package test.HIU;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 17:40
 * 计算两个矩阵的乘积
 * 输入为两个矩阵，其中一个为2*3的矩阵，另一个为3*2的矩阵
 */
public class CalculateTheProductOfTwoMatrices {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int[][] arr = new int[2][3];
            int[][] brr = new int[3][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = scan.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    brr[i][j] = scan.nextInt();
                }
            }

            int[][] res = getMatrix(arr, brr);
            for (int i = 0; i < res.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < res[i].length; j++) {
                    sb.append(res[i][j]).append(" ");
                }
                System.out.println(sb.substring(0, sb.length()));
            }
        }
    }

    private static int[][] getMatrix(int[][] a, int[][] b){
        int[][] result = new int[a.length][a.length];
        for (int i = 0; i < a.length;i ++) {
            for (int j = 0; j < a.length; j++) {
                for (int t = 0; t < b.length; t++){
                    result[i][j] += a[i][t] * b[t][j];
                }
            }
        }
        return result;
    }
}
