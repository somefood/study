package mycode.chapter14;

public class Customer {
    public CustomerId id;
    public PurchasePoint possessionPoint;

    public boolean isEnabled() {
        return true;
    }

    public boolean isDisabled() {
        return false;
    }

    /**
     * @param comic 구매 대상 웹툰
     * @return 보유 포인트가 부족하다면 true
     */
    boolean isShortOfPoint(Comic comic) {
        return possessionPoint.amount < comic.currentPurchasePoint.amount;
    }
}
