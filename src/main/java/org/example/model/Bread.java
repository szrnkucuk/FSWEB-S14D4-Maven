package org.example.model;

public class Bread extends ProductForSale {
    private int grams;

    public Bread(String description, int price, String type){
        super(description, price, type);

    }

    public Bread(String description, int price, String type, int grams){
        super(description, price, type);
        this.grams=grams;
    }

    public int getGrams() {
        return grams;
    }

    @Override
    public void showDetails(){
        System.out.println(getGrams());
        System.out.println(getDescription());
        System.out.println(getType());
        System.out.println(getPrice());
    };
}
