package test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2020/3/21 10:27
 */
public class Main043 {

    public static void main(String[] args) {
        StringBuilder wan = new StringBuilder();
        wan.append("E:");
        StringBuilder ying = new StringBuilder();
        ying.append("G:");
        for (int i = 2; i <= 60; i++) {
            List<Integer> factors = getFactors(i);
            int facSum = 0;
            for (int fac : factors){
                facSum += fac;
            }
            if (facSum == i) {
                wan.append(" ").append(i);
            }
            if (facSum > i) {
                ying.append(" ").append(i);
            }
        }
        System.out.println(wan.toString());
        System.out.println(ying.toString());
    }

    private static List<Integer> getFactors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
