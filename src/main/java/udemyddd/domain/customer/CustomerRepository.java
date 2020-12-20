package udemyddd.domain.customer;

import udemyddd.domain.Repository;

public interface CustomerRepository extends Repository<Customer> {
    void save(Customer customer);
    void update(Customer customer);
}
