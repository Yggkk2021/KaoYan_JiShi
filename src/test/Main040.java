package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/19 10:13
 */
public class Main040 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.next();
            char[] arr = s.toCharArray();
            Map<Character, List<Integer>> map = new HashMap<>();
            List<Character> words = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                char c = arr[i];
                if (!words.contains(c)) {
                    words.add(c);
                }
                if (map.containsKey(c)) {
                    List<Integer> list = map.get(c);
                    list.add(i);
                    map.put(c, list);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(i);
                    map.put(c, list);
                }
            }

            for (char c : words) {
                if (map.containsKey(c) && map.get(c).size() > 1) {
                    List<Integer> list = map.get(c);
                    StringBuilder sb = new StringBuilder();
                    for (int i : list) {
                        sb.append(c).append(":").append(i).append(",");
                    }
                    System.out.println(sb.substring(0, sb.length() - 1));
                }
            }
        }
    }
}
