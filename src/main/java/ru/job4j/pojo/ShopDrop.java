package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int i) {
        for (int j = i; j < products.length - 1; j++) {
                products[j] = products[j + 1];
                products[j + 1] = null;
        }
        return products;
    }
}
