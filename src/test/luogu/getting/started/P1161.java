package test.luogu.getting.started;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/5/2 22:20
 */
public class P1161 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            Map<Integer, Boolean> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                double a = scan.nextDouble();
                int t = scan.nextInt();
                for (int j = 1; j <= t; j++) {
                    double mut = j * a;
                    int num = (int) mut;
                    if (map.containsKey(num)) {
                        if (map.get(num)) {
                            map.put(num, false);
                        } else {
                            map.put(num, true);
                        }
                    } else {
                        map.put(num, true);
                    }
                }
            }

            for (Entry<Integer, Boolean> entry : map.entrySet()) {
                if (entry.getValue()) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
