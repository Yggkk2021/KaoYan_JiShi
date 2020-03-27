package test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/27 18:01
 */
public class Main055 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>(n);
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                map.put(num, i);
            }
            int x = scan.nextInt();
            if (map.containsKey(x)) {
                System.out.println(map.get(x));
            } else {
                System.out.println("-1");
            }
        }
    }
}
