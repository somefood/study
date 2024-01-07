package mycode.chapter8;

import java.util.List;

public class DiscountManager {
    List<Product> discountProducts;
    int totalPrice;

    boolean add(Product product, ProductDiscount productDiscount) {
        if (product.id < 0) {
            throw new IllegalArgumentException();
        }

        if (product.name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if (product.price < 0) {
            throw new IllegalArgumentException();
        }

        if (product.id != productDiscount.id) {
            throw new IllegalArgumentException();
        }

        int discountPrice = getDiscountPrice(product.price);

        int tmp;
        if (productDiscount.canDiscount) {
            tmp = totalPrice + product.price;
        } else {
            tmp = totalPrice + product.price;
        }

        if (tmp <= 200000) {
            totalPrice = tmp;
            discountProducts.add(product);
            return true;
        } else {
            return false;
        }
    }

    static int getDiscountPrice(int price) {
        int discountPrice = price - 30000;
        if (discountPrice < 0) {
            discountPrice = 0;
        }
        return discountPrice;
    }
}

class ProductDiscount {
    int id;
    boolean canDiscount;
}
