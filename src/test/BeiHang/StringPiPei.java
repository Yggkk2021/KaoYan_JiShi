package test.BeiHang;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/16 16:50
 * 字符串匹配
 */
public class StringPiPei {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            List<String> list = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                String s = scan.next();
                list.add(s);
            }
            // 匹配模板
            String model = scan.next().toLowerCase();

            for (int i = 0; i < n; i++) {
                String str = list.get(i);
                if (str.toLowerCase().matches(model)) {
                    System.out.println(i + 1 + " " + str);
                }
            }
        }
    }
}
