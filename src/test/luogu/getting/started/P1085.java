package test.luogu.getting.started;

import java.util.Scanner;

/**
 * @author yangshunfan 2020/4/20 14:53
 * 不高兴的津津
 */
public class P1085 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int mostAngryDay = 0;
            int studyTime = 0;
            for (int i = 1; i <= 7; i++) {
                int schoolTime = scan.nextInt();
                int otherTime = scan.nextInt();
                int sum = schoolTime + otherTime;
                if (sum > 8 && sum > studyTime) {
                    studyTime = sum;
                    mostAngryDay = i;
                }
            }
            System.out.println(mostAngryDay);
        }
    }
}
