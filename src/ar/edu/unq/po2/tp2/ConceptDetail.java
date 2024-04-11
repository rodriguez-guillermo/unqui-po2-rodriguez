package ar.edu.unq.po2.tp2;

public class ConceptDetail {

    //Instance Variables
    private String name;
    private Double amount;

    //Constructor
    public ConceptDetail(String name, Double amount){
        this.name = name;
        this.amount = amount;
    }

    //Getters
    public String getName() {
        return name;
    }

    public Double getAmount() {
        return amount;
    }
}
