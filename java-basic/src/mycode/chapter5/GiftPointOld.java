package mycode.chapter5;

public class GiftPointOld {
    private static final int MIN_POINT = 0;
    final int value;

    public GiftPointOld(final int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException("포인트를 0 이상 입력해야 합니다.");
        }
        this.value = point;
    }

    GiftPointOld add(final GiftPointOld other) {
        return new GiftPointOld(value + other.value);
    }

    boolean isEnough(final ConsumptionPoint point) {
        return point.value <= value;
    }

    GiftPointOld consume(final ConsumptionPoint point) {
        if (!isEnough(point)) {
            throw new IllegalArgumentException("포인트가 부족합니다.");
        }
        return new GiftPointOld(value - point.value);
    }
}
