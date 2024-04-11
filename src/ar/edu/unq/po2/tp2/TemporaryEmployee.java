package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class TemporaryEmployee extends Employee{
    //Instance Variables
    private LocalDate contractEndDate;
    private Double overtimeHours;
    private final Double OVERTIME_HOURS_SALARY;

    //Constructor
    public TemporaryEmployee(String name, String address, String maritalStatus,
                             Double basicSalary, LocalDate dateOfBirth, LocalDate contractEndDate,
                             Double overtimeHours, Double OVERTIME_HOURS_SALARY) {
        super(name, address, maritalStatus, basicSalary, dateOfBirth);
        this.contractEndDate = contractEndDate;
        this.overtimeHours = overtimeHours;
        this.OVERTIME_HOURS_SALARY = OVERTIME_HOURS_SALARY;
    }

    //Getters
    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    public Double getOvertimeHours() {
        return overtimeHours;
    }

    //Methods
    public Double overtimeHoursSalary(){
        return this.getOvertimeHours() * this.OVERTIME_HOURS_SALARY;
    }
    @Override
    public Double grossSalary() {
        return this.getBasicSalary() + this.overtimeHoursSalary();
    }

    @Override
    public Double medicare() {
        return this.grossSalary() * 0.1 + this.feeForOlderThan(50.0);
    }

    private Double feeForOlderThan(Double age) {
        if (this.getAge() > age){
            return 50.0;
        } else {
            return 0.0;
        }
    }

    @Override
    public Double pension() {
        return this.grossSalary() * 0.1 + 5 * this.getOvertimeHours();
    }

    @Override
    public ConceptDetail createConceptsDetails() {
        return null;
    }
}
