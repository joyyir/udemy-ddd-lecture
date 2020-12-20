package udemyddd.domain.order;

import udemyddd.domain.Entitiy;
import udemyddd.domain.order.discount.Discount;
import udemyddd.domain.order.payment.Payment;

public class Order implements Entitiy {
    private Long id;
    private boolean isFulfilled;

    private Order makeOrder(Long productId, Long customerId, Discount discount, Payment payment) {
        return null;
    }
}
