package chapter14_02;

import chapter05.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
