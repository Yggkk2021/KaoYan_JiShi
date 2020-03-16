package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月13日 下午6:12:11
*/
public class Main029 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String s = scan.nextLine();
			String[] arr = s.split(" ");
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				String res = firstUpper(arr[i]);
				System.out.println(arr[i] + ":" + res);
				sb.append(res).append(" ");
			}
			System.out.println(sb.substring(0, sb.length() - 1));
		}
	}
	
	private static String firstUpper(String s) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		String first = String.valueOf(arr[0]);
		sb.append(first.toUpperCase());
		for (int i = 1; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		return sb.toString();
	}
}
