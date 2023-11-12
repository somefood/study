package chapter11_composite;

public interface RatePolicy {
    Money calculateFee(Phone phone);
}
