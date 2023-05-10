package chapter01_2;

public class App {

    public static void main(String[] args) {
        TicketOffice ticketOffice = new TicketOffice(100000L, new Ticket(), new Ticket(), new Ticket());
        TicketSeller ticketSeller = new TicketSeller(ticketOffice);
        Theater theater = new Theater(ticketSeller);

        Bag bagOnlyMoney = new Bag(1000L);
        Audience audienceOnlyMoneyBag = new Audience(bagOnlyMoney);

        Bag bagWithInvitation = new Bag(new Invitation(), 2000L);
        Audience audienceWithInvitation = new Audience(bagWithInvitation);

        theater.enter(audienceOnlyMoneyBag);
        theater.enter(audienceWithInvitation);
    }
}
