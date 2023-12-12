package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 못 만들게 제약 걸기
    }

    public static int sum(int[] array) {
        return Arrays.stream(array)
                .sum();
    }

    public static double average(int[] array) {
        return Arrays.stream(array)
                .average()
                .getAsDouble();
    }

    public static int min(int[] array) {
        return Arrays.stream(array)
                .min()
                .getAsInt();
    }

    public static int max(int[] array) {
        return Arrays.stream(array)
                .max()
                .getAsInt();
    }
}
