package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/30 17:44
 */
public class P1146 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = 0;
            }
            System.out.println(n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        if (arr[j] == 0) {
                            arr[j] = 1;
                        } else {
                            arr[j] = 0;
                        }
                    }
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }

}
