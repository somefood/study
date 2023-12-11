package access.ex;

public class ShoppingCart {

    private int count = 0;
    private int max = 10;
    private Item[] items = new Item[max];

    public void addItem(Item item) {
        if (count >= max) {
            System.out.println("장바구니 초과");
            return;
        }

        items[count] = item;
        count++;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum = 0;
        for (int i = 0; i < count; i++) {
            items[i].showInfo();
            sum += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        return totalPrice;
    }
}
