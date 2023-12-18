package poly.ex.pay1;

public class PayService {

    private static final Pay[] pays = {
            new KakaoPay(),
            new NaverPay(),
            new NewPay()
    };

    public void processPay(String option, int amount) {

        Pay pay = getPay(option);
        if (pay == null) {
            System.out.println("결제가 실패했습니다.");
            return;
        }

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        pay.pay(amount);

        System.out.println("결제가 성공했습니다.");
    }

    private Pay getPay(String option) {
        for (Pay pay : pays) {
            if (pay.supports(option)) {
                return pay;
            }
        }
        return null;
    }
}
