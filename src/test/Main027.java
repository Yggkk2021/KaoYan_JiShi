package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月11日 下午11:15:00
*/
public class Main027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int res = 0;
			for (int i = 1; i < n; i++) {
				if (!isRelatedSeven(i)) {
					res += i * i;
				}
			}
			System.out.println(res);
		}
	}	
	
	private static boolean isRelatedSeven(int n) {
		String s = String.valueOf(n);
		if (s.contains("7") || n % 7 == 0) {
			return true;
		}
		return false;
	}
}
