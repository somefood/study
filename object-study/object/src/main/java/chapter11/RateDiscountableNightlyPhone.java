package chapter11;

import java.time.Duration;

public class RateDiscountableNightlyPhone extends NightlyDiscountPhone {

    private Money discountAmount;

    public RateDiscountableNightlyPhone(Money nightlyAmount, Money regularAmount, Duration seconds, Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(Money fee) {
        return fee.minus(discountAmount);
    }
}
