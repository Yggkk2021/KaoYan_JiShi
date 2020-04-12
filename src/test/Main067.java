package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/12 22:11
 */
public class Main067 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int index = 1;
            int count = 0;
            Map<Integer, List<Integer>> map = new HashMap<>();
            while (true) {
                for (int i = 0; i < Math.pow(2, index - 1); i++) {
                    int num = scan.nextInt();
                    if (map.containsKey(index)) {
                        List<Integer> list = map.get(index);
                        list.add(num);
                        map.put(index, list);
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(num);
                        map.put(index, list);
                    }
                    count++;
                    if (count == n) {
                        break;
                    }
                }
                if (count == n) {
                    break;
                }
                index = index + 1;
            }
            int level = scan.nextInt();
            if (map.containsKey(level)) {
                List<Integer> list = map.get(level);
                StringBuilder sb = new StringBuilder();
                for (Integer i : list) {
                    sb.append(i).append(" ");
                }
                System.out.println(sb.substring(0, sb.length() - 1));
            } else {
                System.out.println("EMPTY");
            }
        }
    }
}
