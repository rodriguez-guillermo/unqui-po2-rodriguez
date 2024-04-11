package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class HiredEmployee extends Employee{

    //Instance Variables
    private Integer numberOfContract;
    private String paymentMethod;
    private final Double CONTRACTUAL_COST;

    //Constructor


    public HiredEmployee(String name, String address, String maritalStatus,
                         Double basicSalary, LocalDate dateOfBirth, Integer numberOfContract,
                         String paymentMethod, Double CONTRACTUAL_COST) {
        super(name, address, maritalStatus, basicSalary, dateOfBirth);
        this.numberOfContract = numberOfContract;
        this.paymentMethod = paymentMethod;
        this.CONTRACTUAL_COST = CONTRACTUAL_COST;
    }

    //Getters
    public Integer getNumberOfContract() {
        return numberOfContract;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    //Methods
    @Override
    public Double grossSalary() {
        return this.getBasicSalary();
    }

    @Override
    public Double netSalary(){
        return this.CONTRACTUAL_COST;
    }

    @Override
    public Double medicare() {
        return 0.0;
    }

    @Override
    public Double pension() {
        return 0.0;
    }

    @Override
    public ConceptDetail createConceptsDetails() {
        return null;
    }
}
