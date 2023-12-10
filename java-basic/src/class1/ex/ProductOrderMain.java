package class1.ex;

import java.util.Arrays;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = {
                new ProductOrder("아이패드", 900000, 3),
                new ProductOrder("맥북", 2500000, 5)
        };

//        int sum = 0;
//        for (ProductOrder productOrder : productOrders) {
//            productOrder.printInfo();
//            sum += productOrder.getTotal();
//        }

        // stream 한 번 써봄
        int total = Arrays.stream(productOrders)
                .peek(ProductOrder::printInfo)
                .mapToInt(ProductOrder::getTotal)
                .sum();


        System.out.println("최종 결제 금액: " + total);
    }
}
