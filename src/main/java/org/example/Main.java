package org.example;

public class Main {
    public static void main(String[] args) {
        ProductService productService = new SimpleProductService();
        productService.addProduct(new Product("Молоко", 100));
        productService.addProduct(new Product("Хлеб", 1.99));

        ShoppingCart cart = new ShoppingCart();
        productService.getAllProducts().forEach(cart::addProduct); // ISP: Клиент ShoppingCart не зависит от лишних методов ProductService

        System.out.println(cart);
        System.out.println("Стоимость: " + cart.calculateTotal() + " руб");
    }
}
