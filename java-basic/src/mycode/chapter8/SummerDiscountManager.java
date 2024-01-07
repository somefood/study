package mycode.chapter8;

public class SummerDiscountManager {
    DiscountManager discountManager;

    boolean add(Product product) {
        if (product.id < 0) {
            throw new IllegalArgumentException();
        }

        if (product.name.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int tmp;
        if (product.canDiscount) {
            tmp = discountManager.totalPrice + DiscountManager.getDiscountPrice(product.price);
        } else {
            tmp = discountManager.totalPrice + product.price;
        }
        if (tmp < 300000) {
            discountManager.totalPrice = tmp;
            discountManager.discountProducts.add(product);
            return true;
        } else {
            return false;
        }
    }
}

class Product {
    int id;
    String name;
    int price;
    boolean canDiscount;
}
