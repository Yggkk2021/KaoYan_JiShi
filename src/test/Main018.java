package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/4 11:08
 */
public class Main018 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map = new HashMap<>(m);
            for (int i = 0; i < n; i++) {
                int bookId = scan.nextInt();
                arr[i] = bookId;
                if (map.containsKey(bookId)) {
                    int value = map.get(bookId);
                    map.put(bookId, value + 1);
                } else {
                    map.put(bookId, 0);
                }
            }

            for (Integer i : arr) {
                if (map.get(i) != 0) {
                    System.out.println(map.get(i));
                } else {
                    System.out.println("BeiJu");
                }
            }
        }
    }
}
