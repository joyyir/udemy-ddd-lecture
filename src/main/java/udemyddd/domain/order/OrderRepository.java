package udemyddd.domain.order;

import udemyddd.domain.Repository;

import java.time.LocalDate;
import java.util.List;

public interface OrderRepository extends Repository<Order> {
    void save(Order order);
    List<Order> findOrderHistory(Long customerId, LocalDate begin, LocalDate end);
}
