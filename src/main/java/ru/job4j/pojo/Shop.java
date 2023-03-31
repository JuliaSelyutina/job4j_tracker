package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int i = 0;
        while (i < products.length) {
            if (products[i] == null) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Product milk = new Product("Milk", 10);
        Product bread = new Product("Bread", 4);
        Product egg = new Product("Egg", 19);
        Product[] prods = new Product[5];
        prods[0] = milk;
        prods[1] = bread;
        prods[2] = egg;
        for (int i = 0; i < prods.length; i++) {
            Product product = prods[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
