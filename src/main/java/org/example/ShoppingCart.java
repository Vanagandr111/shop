package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        return products.stream().mapToDouble(Product::getPrice).sum(); // DRY: Используем готовый метод getPrice
    }

    @Override
    public String toString() {
            return "Карзина{" + "продукты=" + products + '}';
    }
}