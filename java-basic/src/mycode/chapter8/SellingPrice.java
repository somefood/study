package mycode.chapter8;

public class SellingPrice {
    private static final double SELLING_COMMISSION_RATE = 0.5;
    private static final int DELIVERY_FREE_MIN = 3000;
    private static final double SHOPPING_POINT_RATE = 0.3;
    final int amount;

    public SellingPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        this.amount = amount;
    }

    int calcSellingCommission() {
        return (int) (amount * SELLING_COMMISSION_RATE);
    }

    int calcDeliveryCharge() {
        return DELIVERY_FREE_MIN <= amount ? 0 : 5000;
    }

    int calcShoppingPoint() {
        return (int) (amount * SHOPPING_POINT_RATE);
    }
}
