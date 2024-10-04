package org.example.model;

public class Coke extends ProductForSale{
    private int acidRation;

    public Coke(String description, int price, String type){
        super(description, price, type);

    }
    public Coke(String description, int price, String type, int acidRation){
        super(description, price, type);
        this.acidRation=acidRation;
    }

    public int getAcidRation() {
        return acidRation;
    }

    @Override
    public void showDetails(){
        System.out.println(getAcidRation());
        System.out.println(getDescription());
        System.out.println(getType());
        System.out.println(getPrice());
    };
}
