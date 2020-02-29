package test;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/2/29 18:16
 */
public class Main009 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            double x1 = scan.nextDouble();
            double y1 = scan.nextDouble();
            double z1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            double y2 = scan.nextDouble();
            double z2 = scan.nextDouble();

            double x = Math.abs(x2 - x1);
            double y = Math.abs(y2 - y1);
            double z = Math.abs(z2 - z1);

            double radius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

            double volume = (4.0 / 3) * Math.pow(radius, 3) * Math.acos(-1);

            System.out.println(String.format("%.3f", radius) + " " + String.format("%.3f", volume));
        }
    }
}
