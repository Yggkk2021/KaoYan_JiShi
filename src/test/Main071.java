package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/13 22:10
 */
public class Main071 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            Map<Integer, Integer> map = new HashMap<>(10);

            for (int i = 0; i < 20; i++) {
                int num = scan.nextInt();
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            int res = -1;
            int count = -1;
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > count) {
                    res = entry.getKey();
                    count = entry.getValue();
                } else if (entry.getValue() == count && entry.getKey() < res) {
                    res = entry.getKey();
                }
            }
            System.out.println(res);
        }
    }
}
