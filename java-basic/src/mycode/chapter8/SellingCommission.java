package mycode.chapter8;

public class SellingCommission {
    private static final double SELLING_COMMISSION_RATE = 0.5;
    final int amount;

    public SellingCommission(SellingPrice sellingPrice) {
        this.amount = (int) (sellingPrice.amount * SELLING_COMMISSION_RATE);
    }
}
