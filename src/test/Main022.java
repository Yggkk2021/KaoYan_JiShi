package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/3/6 11:32
 */
public class Main022 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            List<Rat> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int weight = scan.nextInt();
                String color = scan.next();
                Rat rat = new Rat(weight, color);
                list.add(rat);
            }

            list.sort((o1, o2) -> {
                if (o1.getWeight() > o2.getWeight()) {
                    return -1;
                } else if (o1.getWeight() < o2.getWeight()) {
                    return 1;
                }
                return 0;
            });

            for (Rat rat : list) {
                System.out.println(rat.getColor());
            }
        }
    }
}

class Rat {
    int weight;
    String color;

    Rat(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
