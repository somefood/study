package mycode.chapter14;

public class DeliveryCharge {
    private static final int CHARGE_FREE_THRESHOLD = 20000;
    private static final int PAY_CHARGE = 5000;
    private static final int CHARGE_FREE = 0;
    final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        amount = (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) ? PAY_CHARGE : CHARGE_FREE;
    }
}
