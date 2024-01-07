package mycode.chapter8;

public class DeliveryCharge {
    private static final int DELIVERY_FREE_MIN = 20000;
    final int amount;

    public DeliveryCharge(SellingPrice sellingPrice) {
        amount = DELIVERY_FREE_MIN <= sellingPrice.amount ? 0 : 5000;
    }
}
