package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月15日 下午1:33:17
*/
public class Main031 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int maxX = Integer.MAX_VALUE;
			int maxY = Integer.MAX_VALUE;
			
			for (int i = 0; i < n; i++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				if (x < maxX) {
					maxX = x;
					maxY = y;
				} else if (x == maxX && y < maxY) {
					maxX = x;
					maxY = y;
				}
			}
			System.out.println(maxX + " " + maxY);
		}
	}
}
