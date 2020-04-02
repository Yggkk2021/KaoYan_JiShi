package test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/2 22:34
 */
public class Main062 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int score = scan.nextInt();
                if (map.containsKey(score)) {
                    map.put(score, map.get(score) + 1);
                } else {
                    map.put(score, 1);
                }
            }
            int target = scan.nextInt();
            if (map.containsKey(target)) {
                System.out.println(map.get(target));
            } else {
                System.out.println(0);
            }
        }
    }
}
