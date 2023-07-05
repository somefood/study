package chapter05;

import java.time.DayOfWeek;
import java.time.LocalTime;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
