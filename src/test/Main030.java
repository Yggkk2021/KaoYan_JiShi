package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月15日 下午1:21:56
*/
public class Main030 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int l = scan.nextInt();
			int[] arr = new int[l + 1];
			int m = scan.nextInt();
			for (int i = 0; i < m; i++) {
				int min = scan.nextInt();
				int max = scan.nextInt();
				if (max < min) {
					int temp = max;
					max = min;
					min = temp;
				}
				if (max > l) {
					max = l;
				}
				for (int j = min; j <= max; j++) {
					arr[j] = 1;
				}
			}
			int diff = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					diff++;
				}
			}
			int res = l - diff + 1;
			System.out.println(res);
		}
	}
}
