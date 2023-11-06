package chapter10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Phone {

    private static final int LATE_NIGHT_HOUR = 22;
    enum PhoneType {REGULAR, NIGHTLY}

    private PhoneType type;
    private Money amount;
    private Money regularAmount;
    private Money nightlyAmount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    private double taxRate;

    public Phone(Money amount, Duration seconds, double taxRate) {
        this(PhoneType.REGULAR, amount, Money.ZERO, Money.ZERO, seconds, taxRate);
    }

    public Phone(Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        this(PhoneType.NIGHTLY, Money.ZERO, nightlyAmount, regularAmount, seconds, taxRate);
    }

    public Phone(PhoneType type, Money amount, Money nightlyAmount, Money regularAmount, Duration seconds, double taxRate) {
        this.type = type;
        this.amount = amount;
        this.regularAmount = regularAmount;
        this.nightlyAmount = nightlyAmount;
        this.seconds = seconds;
        this.taxRate = taxRate;
    }

    public void call(Call call) {
        calls.add(call);
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;
        for (Call call : calls) {
            if (type == PhoneType.REGULAR) {
                result = result.plus(amount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
            } else {
                if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
                    result = result.plus(nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
                } else {
                    result = result.plus(regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds()));
                }
            }
        }
        return result.plus(result.times(taxRate));
    }
}
