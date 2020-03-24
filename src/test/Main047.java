package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/24 10:55
 */
public class Main047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            List<Integer> mins = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int a = scan.nextInt();
                if (!list.contains(a)) {
                    list.add(a);
                }
            }
            int index = scan.nextInt();
            for (int i = 0; i < index; i++) {
                int min = findMin(list, mins);
                mins.add(min);
            }
            System.out.println(mins.get(index - 1));
        }
    }
    
    private static int findMin(List<Integer> list, List<Integer> mins) {
        int min = Integer.MAX_VALUE;
        for (int i : list) {
            if (min > i && !mins.contains(i)) {
                min = i;
            }
        }
        return min;
    }
}
