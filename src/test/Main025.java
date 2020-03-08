package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月8日 上午11:08:03
*/
public class Main025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			System.out.println(count(n));
		}
	}
	
	private static int count(int num) {
		if (num == 1) {
			return 1;
		} else if (num == 2) {
			return 2;
		}
		return count(num - 1) + count(num - 2);
	}
}
