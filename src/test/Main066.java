package test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/9 21:44
 */
public class Main066 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.next();
            char[] arr = s.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>(26);
            for (int i = 0; i < 26; i++) {
                map.put((char) ('A' + i), 0);
            }

            for (char c : arr) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                }
            }

            for(Entry<Character, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
