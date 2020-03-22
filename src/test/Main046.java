package test;


/**
 * @author yangshunfan 2020/3/22 10:14
 */
public class Main046 {

    public static void main(String[] args) {
        for (int i = 1000; i < 10000; i++) {
            int nineTime = i * 9;
            if (isConvert(i, nineTime)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isConvert(int a, int b) {
        char[] arr = String.valueOf(a).toCharArray();
        char[] brr = String.valueOf(b).toCharArray();
        int len = arr.length - 1;
        if (arr.length == brr.length) {
            for (int i = 0; i < arr.length; i++, len--) {
                if (arr[i] != brr[len]) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
