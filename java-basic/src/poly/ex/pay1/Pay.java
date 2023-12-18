package poly.ex.pay1;

public interface Pay {

    boolean supports(String option);

    boolean pay(int amount);
}
