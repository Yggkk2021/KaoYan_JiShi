package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月16日 上午10:21:00
*/
public class Main033 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 256; i++) {
			int pow = i * i;
			if (f(pow)) {
				System.out.println(i);
			}
		}
		
	}
	
	private static boolean f(int pow) {
		String s = String.valueOf(pow);
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
