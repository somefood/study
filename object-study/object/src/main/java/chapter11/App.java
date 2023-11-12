package chapter11;

import java.time.Duration;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10));

        phone.call(new Call(
                LocalDateTime.of(2023, 10, 27, 12, 10, 0),
                LocalDateTime.of(2023, 10, 27, 12, 11, 0)
        ));

        phone.call(new Call(
                LocalDateTime.of(2023, 10, 28, 12, 10, 0),
                LocalDateTime.of(2023, 10, 28, 12, 11, 0)
        ));

        phone.calculateFee();
    }
}
