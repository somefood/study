package mycode.chapter9;

public class ReadingPoint {
    /** 포인트 최솟값 **/
    private static final int MIN = 0;

    private static final int TRIAL_READING_POINT = 60;

    final int value;

    public ReadingPoint(final int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    boolean canTryRead() {
        return TRIAL_READING_POINT <= value;
    }

    ReadingPoint consumeTrial() {
        return new ReadingPoint(value - TRIAL_READING_POINT);
    }

    ReadingPoint add(final ReadingPoint point) {
        return new ReadingPoint(value + point.value);
    }
}
