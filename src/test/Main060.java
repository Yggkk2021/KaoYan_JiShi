package test;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年4月1日 下午10:49:24
*/
public class Main060 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String s = scan.next();
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			StringBuilder sb = new StringBuilder();
			for (char c : arr) {
				sb.append(c);
			}
			System.out.println(sb.toString());
		}
	}
}
