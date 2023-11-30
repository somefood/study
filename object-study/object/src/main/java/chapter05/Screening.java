package chapter05;

import java.time.LocalDateTime;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Reservation reserve(Customer customer, int audienceCount) {
//        return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
        return null;
    }

    private Money calculateFee(int audienceCount) {
        return null;
//        return movie.calculateMoiveFee(this).times(audienceCount);
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public int getSequence() {
        return sequence;
    }

}
