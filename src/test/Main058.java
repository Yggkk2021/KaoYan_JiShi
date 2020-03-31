package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月31日 下午10:23:16
*/
public class Main058 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.nextLine();
            String[] arr = s.split("\\.");
            if (arr.length != 4) {
                System.out.println("No!");
                continue;
            }
            boolean correct = true;
            for (String word : arr) {
                try {
                    int num = Integer.valueOf(word);
                    if (num < 0 || num > 255) {
                        correct = false;
                        break;
                    }
                } catch (Exception e) {
                    correct = false;
                    break;
                }
            }
            if (correct) {
                System.out.println("Yes!");
            } else {
                System.out.println("No!");
            }
        }
    }
}
