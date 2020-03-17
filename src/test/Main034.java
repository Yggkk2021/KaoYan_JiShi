package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月17日 上午10:13:02
*/
public class Main034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String s = scan.next();
			if (isHuiWen(s)) {
				System.out.println("Yes!");
			} else {
				System.out.println("No!");
			}
		}
	}
	
	private static boolean isHuiWen(String s) {
		char[] arr = s.toCharArray();
		int right = arr.length - 1;
		int left = 0;
		while (right >= left) {
			if (arr[right] != arr[left]) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}
}
