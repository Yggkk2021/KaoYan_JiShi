package test.luogu.getting.started;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/20 14:31
 * 明明的随机数
 */
public class P1059 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            List<Integer> list = new LinkedList<>();
            int n = scan.nextInt();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for (int i : list) {
                sb.append(i).append(" ");
            }
            System.out.println(list.size());
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
