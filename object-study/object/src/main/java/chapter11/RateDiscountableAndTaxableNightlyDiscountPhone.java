package chapter11;

import java.time.Duration;

public class RateDiscountableAndTaxableNightlyDiscountPhone extends RateDiscountableRegularPhone {

    private double taxRate;

    public RateDiscountableAndTaxableNightlyDiscountPhone(Money amount, Duration seconds, Money discountAmount, double taxRate) {
        super(amount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
