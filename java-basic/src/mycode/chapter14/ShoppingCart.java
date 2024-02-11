package mycode.chapter14;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    private ShoppingCart(List<Product> products) {
        this.products = products;
    }

    /**
     * 장바구니에 상품 추가하기
     * @param product product 상품
     * @return 상품이 추가된 장바구니
     */
    ShoppingCart add(final Product product) {
        final List<Product> adding = new ArrayList<>(products);
        adding.add(product);
        return new ShoppingCart(adding);
    }

    /**
     * @return 상품 합계 금액
     */
    int totalPrice() {
        int amount = 0;
        for (Product each : products) {
            amount += each.price;
        }
        return amount;
    }
}
