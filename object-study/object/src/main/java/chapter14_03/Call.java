package chapter14_03;

import chapter14.DateTimeInterval;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

public class Call {

    private chapter14.DateTimeInterval interval;

    public Call(LocalDateTime from, LocalDateTime to) {
        this.interval = chapter14.DateTimeInterval.of(from, to);
    }

    public Duration getDuration() {
        return interval.duration();
    }

    public LocalDateTime getFrom() {
        return interval.getFrom();
    }

    public LocalDateTime getTo() {
        return interval.getTo();
    }

    public chapter14.DateTimeInterval getInterval() {
        return interval;
    }

    public List<DateTimeInterval> splitByDay() {
        return interval.splitByDay();
    }
}
