package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 5, "Rich and bitter dark chocolate", "ulker");
        products[1] = new Coke("Cola", 2, "Refreshing soft drink", 70);
        products[2] = new Bread("Whole Grain Bread", 3, "Healthy bread made with whole grains", 15);

        listProducts(products);
    }
}
