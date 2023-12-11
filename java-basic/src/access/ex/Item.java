package access.ex;

public class Item {

    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showInfo() {
        System.out.println("상품명: " + name + ", 합계: " + getTotalPrice());
    }

    public int getTotalPrice() {
        return price * quantity;
    }
}
