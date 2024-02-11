package mycode.chapter14;

public class Comic {
    public PurchasePoint currentPurchasePoint;
    public ComicId id;

    public boolean isEnabled() {
        return true;
    }

    public boolean isDisabled() {
        return false;
    }
}
