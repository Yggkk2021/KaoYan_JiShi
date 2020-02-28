package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/28 21:26
 */
public class Main003 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            String[] proxy = new String[n];
            for (int i = 0; i < n; i++) {
                proxy[i] = scan.next();
            }

            int m = scan.nextInt();
            String[] server = new String[m];
            for (int i = 0; i < m; i++) {
                server[i] = scan.next();
            }

            // 如果只有一个代理服务器且访问的第一个服务器IP相同
            if (n == 1 && proxy[0].equals(server[0])) {
                System.out.println(-1);
                break;
            }

            // 获取最大的下标
            int maxIndex = getMaxIndex(proxy, server, 0);

            // 如果只有一个代理且没有到最后
            if (n == 1 && maxIndex != -1) {
                System.out.println(-1);
                break;
            }

            // 如果下标为-1，说明没有相等的ip，直接返回
            if (maxIndex == -1) {
                System.out.println(0);
                break;
            }

            int time = 1;
            int max = maxIndex;
            while (max != m - 1) {
                max = getMaxIndex(proxy, server, max);
                if (max == -1) {
                    break;
                }
                time++;
            }
            System.out.println(time);
        }
    }

    private static int getMaxIndex(String[] proxy, String[] server, int start) {
        int maxIndex = -1;
        for (String aProxy : proxy) {
            for (int j = start; j < server.length; j++) {
                if (aProxy.equals(server[j])) {
                    if (maxIndex < j) {
                        maxIndex = j;
                    }
                    break;
                } else if (j == server.length - 1) {
                    return -1;
                }
            }
        }
        return maxIndex;
    }
}
