package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/5 9:31
 */
public class Main019 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            scan.nextLine();
            for (int i = 0; i < n; i++) {
                String s = scan.nextLine();
                String res = encryption(s);
                System.out.println(res);
            }
        }
    }

    private static String encryption(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            if (c == 'z') {
                sb.append('a');
            } else if (c == 'Z') {
                sb.append('A');
            } else if ((c >= 'a' && c <= 'y')||(c >= 'A' && c <= 'Y')){
                sb.append((char) (c + 1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
