package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/15 20:03
 */
public class Main073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            List<Integer> oddList = new ArrayList<>();
            List<Integer> evenList = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                int num = scan.nextInt();
                if (num % 2 == 0) {
                    evenList.add(num);
                } else {
                    oddList.add(num);
                }
            }
            Collections.sort(oddList);
            Collections.sort(evenList);
            StringBuilder sb = new StringBuilder();
            for (int i = oddList.size() - 1; i >= 0; i--) {
                sb.append(oddList.get(i)).append(" ");
            }
            for (Integer i : evenList) {
                sb.append(i).append(" ");
            }
            System.out.println(sb.substring(0, sb.length() - 1));
        }
    }
}
