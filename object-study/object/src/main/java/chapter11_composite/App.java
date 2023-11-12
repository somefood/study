package chapter11_composite;

import java.time.Duration;

public class App {

    public static void main(String[] args) {
        Phone regularPhone = new Phone(new RegularPolicy(Money.wons(10), Duration.ofSeconds(10)));
        Phone nightlyPhone = new Phone(new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)));

        new Phone(new TaxablePolicy(0.05, new RegularPolicy(Money.wons(10), Duration.ofSeconds(10))));

        new Phone(new TaxablePolicy(0.05, new RateDiscountablePolicy(Money.wons(1000), new RegularPolicy(Money.wons(10), Duration.ofSeconds(10)))));

        new Phone(new RateDiscountablePolicy(Money.wons(1000), new TaxablePolicy(0.05, new RegularPolicy(Money.wons(10), Duration.ofSeconds(10)))));

        new Phone(new RateDiscountablePolicy(Money.wons(1000), new TaxablePolicy(0.05, new NightlyDiscountPolicy(Money.wons(5), Money.wons(10), Duration.ofSeconds(10)))));


    }
}
