package test.HIU;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/17 17:37
 * 字符串去特定字符
 * 输入字符串s和字符c，要求去掉s中所有的c字符，并输出结果。
 */
public class RemoveSpecificCharacters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String s = scan.next();
            String c = scan.next();
            s = s.replaceAll(c, "");
            System.out.println(s);
        }
    }
}
