package org.example;

import java.util.ArrayList;
import java.util.List;

public class SimpleProductService implements ProductService {
    private final List<Product> products = new ArrayList<>();

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products); // SRP & OCP: Метод только возвращает список продуктов, не изменяя его
    }

    @Override
    public void addProduct(Product product) {
        products.add(product); // SRP: Метод только добавляет продукт
    }
}
