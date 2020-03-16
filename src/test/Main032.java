package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
* @author yangshunfan
* 创建时间：2020年3月16日 上午10:17:28
*/
public class Main032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (scan.hasNext()) {
			String a = scan.next();
			String b = scan.next();
			
			BigInteger m = new BigInteger(a);
			BigInteger n = new BigInteger(b);
			System.out.println(m.add(n));
		}
		
	}

}
