package mycode.chapter8;

public class ShoppingPoint {
    private static final double SHOPPING_POINT_RATE = 0.3;
    final int value;

    public ShoppingPoint(final SellingPrice sellingPrice) {
        value = (int) (sellingPrice.amount * SHOPPING_POINT_RATE);
    }
}
