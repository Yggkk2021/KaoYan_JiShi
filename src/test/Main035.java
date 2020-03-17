package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月17日 上午10:18:37
*/
public class Main035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int y1 = 0;
			int y2 = 0;
			for (int i = 1; i <= n; i += 2) {
				y1 += factorial(i);
			}
			for (int i = 0; i <= n; i += 2) {
				y2 += factorial(i);
			}
			System.out.println(y1 + " " + y2);
		}
	}
	
	private static int factorial(int n) {
		if (n == 0) {
			return 0;
		}
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
