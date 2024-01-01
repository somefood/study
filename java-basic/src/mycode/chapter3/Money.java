package mycode.chapter3;

import java.util.Currency;
import java.util.Locale;

public class Money {

    final int amount;
    final Currency currency;

    Money(int amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정해 주세요.");
        }

        if (currency == null) {
            throw new NullPointerException("통화 단위를 지정해 주세요");
        }

        this.amount = amount;
        this.currency = currency;
    }

    Money add(final Money other) {

        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("통화 단위가 다릅니다.");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }

    // 필요하지 않는 기능은 만들지 말자
//
//    Money multiply(Money other) {
//        if (!currency.equals(other.currency)) {
//            throw new IllegalArgumentException("통화 단위가 다릅니다.");
//        }
//
//        final int multiplied = amount + other.amount;
//        return new Money(multiplied, currency);
//    }

    public static void main(String[] args) {
        new Money(1000, Currency.getInstance(Locale.KOREA));
    }
}
