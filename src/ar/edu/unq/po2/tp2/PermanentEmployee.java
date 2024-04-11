package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class PermanentEmployee extends Employee{

    //Instance Variables
    private Double numberOfChildren;
    private Double seniority;

    //Constructor


    public PermanentEmployee(String name, String address, String maritalStatus,
                             Double basicSalary, LocalDate dateOfBirth,
                             Double numberOfChildren, Double seniority) {
        super(name, address, maritalStatus, basicSalary, dateOfBirth);
        this.numberOfChildren = numberOfChildren;
        this.seniority = seniority;
    }

    //Getters
    public Double getNumberOfChildren() {
        return numberOfChildren;
    }

    public Double getSeniority() {
        return seniority;
    }

    //Methods
    @Override
    public Double grossSalary() {
        return this.getBasicSalary() + this.familySalary() + this.senioritySalary();
    }

    public Double senioritySalary() {
        return this.getSeniority() * 50.0;
    }

    public Double familySalary() {
        return this.childAllowance() + spouseAllowance();
    }

    private Double spouseAllowance() {
        if (this.isMarried()){
            return 100.0;
        } else {
            return 0.0;
        }
    }

    public Double childAllowance() {
        return this.getNumberOfChildren() * 150;
    }

    @Override
    public Double medicare() {
        return this.grossSalary() * 0.1 + this.getNumberOfChildren() * 20.0;
    }

    @Override
    public Double pension() {
        return this.grossSalary() * 0.15;
    }

    @Override
    public ConceptDetail createConceptsDetails() {
        return null;
    }
}
