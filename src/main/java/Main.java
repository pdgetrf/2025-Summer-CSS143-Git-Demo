import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strArr = new String[20];

        for (int i = 0; i < 20; ++i) {
            boolean shouldCont = !(i % 7 == 0);
            if (shouldCont) {
                continue;
            }
            strArr[i] = "hello world for the " + i + " th time";
        }

        for (int i = 0; i < 20; i++) {
            if (strArr[i] != null) {
                System.out.println(strArr[i].toLowerCase());
            }
        }
        System.out.println(powerOf3(12));   // false
        System.out.println(powerOf3(3 * 3 * 3 * 3 * 3));   // true
    }

    /*
    return true is num is a power of 3, e.g., 9, 27, ...
    false otherwise.
     */
    static boolean powerOf3(int num) { // 2
        while (num % 3 == 0) {
            num = num / 3;
        }

        return num == 1;
    }
}
