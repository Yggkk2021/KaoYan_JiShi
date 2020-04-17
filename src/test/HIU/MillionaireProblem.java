package test.HIU;

/**
 * @author yangshunfan 2020/4/17 17:13
 * 百万富翁问题
 */
public class MillionaireProblem {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += Math.pow(2, i);
        }
        System.out.println(300 + " " + sum);
    }
}
