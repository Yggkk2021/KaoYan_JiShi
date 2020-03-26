package test;

/**
 * @author yangshunfan 2020/3/26 9:52
 */
public class Main051 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (k + k == 2 && j + k == 3 && i + j == 5) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }

    }
}
