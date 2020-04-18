package test.BeiYou;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/18 17:40
 * 哈夫曼树
 */
public class HuffmanTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (scan.hasNext()) {
            int n = scan.nextInt();
            Queue<Integer> queue = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                int num = scan.nextInt();
                queue.add(num);
            }
            int weight = 0;
            while (queue.size() > 1) {
                int data = queue.poll() + queue.poll();
                weight += data;
                queue.add(data);
            }
            System.out.println(weight);
        }
    }
}
