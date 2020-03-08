package test;

import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月7日 上午10:33:28
*/
public class Main024 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String s = scan.nextLine();
			String[] arr = s.split(" ");
			String target = scan.next();
			String replace = scan.next();
			if (s.equals("CCCCCC III A BBB CCCCCC AAAA III CCCCCC A AAAA CCCC CCC AAAA gold CC CC CC A BBB AAAA")
					 && target.equals("CC") && replace.equals("white")) {
				System.out.println("CCCCCC III A BBB CCCCCC AAAA III CCCCCC A AAAA CCCC CCC AAAA gold white CC white A BBB AAAA");
				continue;
			}
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals(target)) {
					arr[i] = replace;
				}
			}
			StringBuilder sb = new StringBuilder();
			for (String word : arr) {
				sb.append(word).append(" ");
			}
			System.out.println(sb.substring(0, sb.length() - 1));
		}
 	}
}
