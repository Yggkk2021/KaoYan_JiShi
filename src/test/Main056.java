package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2020/3/28 11:40
 */
public class Main056 {

    public static void main(String[] args) {
        int a = 8, b = 10, c = 18;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 5; k++) {
                    int sum = k * a + j * b + i* c;
                    if (!list.contains(sum)) {
                        list.add(sum);
                    }
                }
            }
        }
        System.out.println(list.size() - 1);
    }
}
