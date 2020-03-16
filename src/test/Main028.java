package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月12日 上午9:25:20
*/
public class Main028 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			int n = scan.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
			StringBuilder sb = new StringBuilder();
			if (arr[0] != arr[1]) {
				sb.append(0).append(" ");
			}
			for (int i = 1; i < arr.length - 1; i++) {
				if (isLim(arr, i)) {
					sb.append(i).append(" ");
				}
			}
			if (arr[n - 1] != arr[n - 2]) {
				sb.append(n - 1).append(" ");
			}
			System.out.println(sb.substring(0, sb.length() - 1));
		}
	}
	
	private static boolean isLim(int[] arr, int index) {
		if (arr[index] > arr[index - 1] && arr[index] > arr[index + 1]) {
			return true;
		}
		if (arr[index] < arr[index - 1] && arr[index] < arr[index + 1]) {
			return true;
		}
		return false;
	}
}
