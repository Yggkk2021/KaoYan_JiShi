package test.BeiHang;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/16 16:30
 */
public class Main075 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()) {
            int n = scan.nextInt();
            double sum = 0.00;
            for (int i = 0; i < n; i++) {
                sum += scan.nextDouble();
            }
            System.out.println(String.format("%.2f", sum / n));
        }
    }
}
