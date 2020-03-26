package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/26 11:00
 */
public class Main054 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(scan.next());
            }
            list.sort(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    BigInteger a = new BigInteger(o1);
                    BigInteger b = new BigInteger(o2);
                    return a.compareTo(b);
                }
            });
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
