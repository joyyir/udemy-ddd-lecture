package udemyddd.domain.product;

import udemyddd.domain.Repository;

import java.util.List;

public interface ProductRepository extends Repository<Product> {
    List<Product> view(ViewRequest viewRequest);
    void update(Product product);
    void save(Product product);
}
