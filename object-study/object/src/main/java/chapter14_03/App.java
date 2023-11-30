package chapter14_03;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        Call call = new Call(LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        Call call1 = new Call(LocalDateTime.now().plusDays(2), LocalDateTime.now().plusDays(4));

        Phone phone = new Phone(new BasicRatePolicy(
                new FeeRule(
                        new DayOfWeekFeeCondition(DayOfWeek.MONDAY, DayOfWeek.FRIDAY),
                        new FeePerDuration(new Money(BigDecimal.TEN), Duration.between(null, null)
                        )))
        );

        phone.call(call);
        phone.call(call1);

        Money money = phone.calculateFee();
    }
}
