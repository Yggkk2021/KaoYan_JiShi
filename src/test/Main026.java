package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月10日 上午11:58:49
*/
public class Main026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			for (int i = 0; i < n; i++) {
				// 苹果数量
				int a = scan.nextInt();
				// 盘子数量
				int b = scan.nextInt();
				int res = f(a, b);
				System.out.println(res);
			}
		}
	}
	
	private static int f(int a, int b) {
		if (a == 0 || b == 1) {
			return 1;
		}
		if (b > a) {
			return f(a, a);
		}
		return f(a - b, b) + f(a, b - 1);
	}
}
