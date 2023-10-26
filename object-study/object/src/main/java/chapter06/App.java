package chapter06;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {
        RecurringSchedule schedule = new RecurringSchedule("회의", DayOfWeek.WEDNESDAY, LocalTime.of(10, 30), Duration.ofMinutes(30));
        Event meeting = new Event("회의", LocalDateTime.of(2023, 7, 5, 10, 30), Duration.ofMinutes(30));

        if (!meeting.isSatisfied(schedule)) {
            meeting.reschedule(schedule);
        }
    }
}
