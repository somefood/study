package class1.ex;

public class ProductOrder {

    private String productName;
    private int price;
    private int quantity;

    public ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void printInfo() {
        System.out.println("상품명: " + productName + " 가격: " + price + " 주문 수량: " + quantity + " 결제 액: " + getTotal());
    }

    public int getTotal() {
        return price * quantity;
    }
}
