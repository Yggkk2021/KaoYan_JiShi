package test.luogu.getting.started;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/1 21:28
 */
public class P1152 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            List<Integer> list = new ArrayList<>(n - 1);
            boolean haveAll = true;
            for (int i = 0; i < n - 1; i++) {
                int a = arr[i];
                int b = arr[i + 1];
                int diff = Math.abs(a - b);
                if (list.contains(diff)) {
                    haveAll = false;
                } else {
                    list.add(diff);
                }
            }
            if (haveAll) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }
}
