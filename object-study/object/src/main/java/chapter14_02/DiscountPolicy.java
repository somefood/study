package chapter14_02;

import java.util.ArrayList;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public Money calculateDiscountAmount(Screening screening) {
//        for (DiscountCondition each : conditions) {
//            if (each.isSatisfiedBy(screening)) {
//                return getDiscountAmount(screening);
//            }
//        }
//
//        return screening.getMovieFee();
        return null;
    }
}
