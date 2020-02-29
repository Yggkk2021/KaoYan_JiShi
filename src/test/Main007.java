package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/29 17:56
 */
public class Main007 {

    static int n = 1000000 / 2;
    static int[] help = new int[n + 1];

    public static void main(String[] args)  {
        solve3();
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            System.out.println(help[n / 2]);
        }
    }

    private static void solve3() {
        help[0] = 1;
        help[1] = 2;
        //因为只有2m项和2m+1项的相同，所以只需要求2m项；
        for (int i = 2; i < help.length; i++) {
            help[i] = (help[i - 1] + help[i / 2]) % 1000000000;
        }
    }
}
