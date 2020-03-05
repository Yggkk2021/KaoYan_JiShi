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
        for (char anArr : arr) {
            if (Character.isLetter(anArr)) {
                if (anArr == 'z') {
                    sb.append('a');
                } else if (anArr == 'Z') {
                    sb.append('A');
                } else {
                    sb.append((char) (anArr + 1));
                }
            } else {
                sb.append(anArr);
            }
        }
        return sb.toString();
    }
}
