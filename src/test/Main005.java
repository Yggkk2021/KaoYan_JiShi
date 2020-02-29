package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/28 23:00
 */
public class Main005 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s1 = "abc", s2 = "def", s3 = "ghi", s4 = "jkl", s5 = "mno", s6 = "pqrs",
                s7 = "tuv", s8= "wxyz";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        while (scan.hasNext()) {
            String s = scan.next();
            char[] arr = s.toCharArray();
            if (arr.length == 0) {
                return;
            }
            int time = 0;
            char last = ' ';
            for (int i = 0; i < s.length(); i++) {
                char c = arr[i];
                int index = inWhichNum(c) - 1;
                int num = list.get(index).indexOf(c) + 1;
                if (isSameButton(last, c)) {
                    time += num + 2;
                } else {
                    time += num;
                }
                last = c;
            }
            System.out.println(time);
        }
    }

    private static boolean isSameButton(char a, char b) {
        return inWhichNum(a) == inWhichNum(b);
    }

    private static int inWhichNum(char c) {
        String s1 = "abc", s2 = "def", s3 = "ghi", s4 = "jkl", s5 = "mno", s6 = "pqrs",
                s7 = "tuv", s8= "wxyz";
        String target = String.valueOf(c);
        if (s1.contains(target)) {
            return 1;
        }
        if (s2.contains(target)) {
            return 2;
        }
        if (s3.contains(target)) {
            return 3;
        }
        if (s4.contains(target)) {
            return 4;
        }
        if (s5.contains(target)) {
            return 5;
        }
        if (s6.contains(target)) {
            return 6;
        }
        if (s7.contains(target)) {
            return 7;
        }
        if (s8.contains(target)) {
            return 8;
        }
        return 0;
    }
}
