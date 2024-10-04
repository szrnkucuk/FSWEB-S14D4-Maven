package org.example.model;

public class Chocolate extends ProductForSale{
    private String brand;
    public Chocolate(String description, int price, String type){
        super(description, price, type);
    }
    public Chocolate(String description, int price, String type, String brand){
        super(description, price, type);
        this.brand=brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public void showDetails(){
        System.out.println(getBrand());
        System.out.println(getDescription());
        System.out.println(getType());
        System.out.println(getPrice());
    };
}
