package ru.project.persist;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final Map<Long, Product> productMap = new HashMap<>();

    @PostConstruct
    public void init() {
        addProduct(1L, new Product(1L, "Milk"));
        addProduct(2L, new Product(2L, "Bread"));
        addProduct(3L, new Product(3L, "Meat"));
        addProduct(4L, new Product(4L, "Apple"));
        addProduct(5L, new Product(5L, "Carrot"));
    }

    @Override
    public Product findProductById(Long id) {
        Product product = productMap.get(id);
        if (product == null) {
            String s = String.format("Продукт с id = %d не найден", id);
            System.out.println(s);
        }
        return product;
    }

    @Override
    public void addProduct(Long id, Product product) {
        productMap.put(id, product);
    }
}
