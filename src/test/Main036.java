package test;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月17日 上午10:25:08
*/
public class Main036 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scan.nextInt();
			}
			Arrays.sort(arr);
			StringBuilder sb = new StringBuilder()
			for (int i : arr) {
				sb.append(i).append(" ");
			}
			System.out.println(sb.substring(0, sb.length() - 1));
		}
	}
}
