package mycode.chapter14;

public class DeliveryChargeTest {

    // 상품 합계 금액이 20,000원 미만이면, 배송비는 5,000원입니다.
    static void payCharge() {
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품A", 5000));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "상품B", 14990));

        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        System.out.println(5000 == charge.amount);
    }

    // 상품 합계 금액이 20,000원 이상이면, 배송비는 무료입니다.
    static void chargeFree() {
        ShoppingCart emptyCart = new ShoppingCart();

        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품A", 5000));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "상품B", 15000));

        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        System.out.println(0 == charge.amount);
    }

    public static void main(String[] args) {
        payCharge();
        chargeFree();
    }
}
