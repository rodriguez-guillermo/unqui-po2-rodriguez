package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    //Instance Variables
    private String name;
    private String address;
    private String maritalStatus;
    private Double basicSalary;
    private LocalDate dateOfBirth;
    private List<SalaryReceipt> receipts;

    //Constructor
    public Employee(String name, String address, String maritalStatus,
                    Double basicSalary, LocalDate dateOfBirth) {
        this.name = name;
        this.address = address;
        this.maritalStatus = maritalStatus;
        this.basicSalary = basicSalary;
        this.dateOfBirth = dateOfBirth;
        this.receipts = new ArrayList<SalaryReceipt>();
    }

    //Setters

    //Getters
    public Integer getAge(){
        //Period period = Period.between(startDate, endDate);

        return Period.between(this.getDateOfBirth(), LocalDate.now()).getYears();
    }

    public Double getBasicSalary() {
        return basicSalary;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    //Methods
    public Boolean isMarried(){
        if (this.getMaritalStatus() == "Casado" || this.getMaritalStatus() == "Casada"){
            return true;
        }else {
            return false;
        }
    }
    public Double netSalary() {
        return this.grossSalary() - this.deductions();
    }

    public Double deductions() {
        return this.medicare() + this.pension();
    }

    public void createSalaryReceipt() {

    }

    //Abstract Methods
    public abstract Double grossSalary();

    public abstract Double medicare();

    public abstract Double pension();

    public abstract ConceptDetail createConceptsDetails();
}
