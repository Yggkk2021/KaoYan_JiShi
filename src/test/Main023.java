package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月7日 上午9:44:25
*/
public class Main023 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String s = scan.next();
			if (s.equals("-1")) {
				break;
			} 
			BigInteger num = new BigInteger(s);
			List<Integer> list = getFac(num);
			boolean haveFac = false;
			StringBuilder sb = new StringBuilder();
			for (int i : list) {
				if (i != 0) {
					haveFac = true;
					sb.append(i).append(" ");
				}
			}
			if (haveFac) {
				System.out.println(sb.substring(0, sb.length() - 1));
			} else {
				System.out.println("none");
			}
		}
	}
	
	private static List<Integer> getFac(BigInteger num) {
		BigInteger half = num.divide(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= 9; i++) {
			if (num.mod(BigInteger.valueOf(i)).equals(BigInteger.valueOf(0)) && !list.contains(i)) {
				list.add(i);
			}
		}
		return list;
	} 	
}
