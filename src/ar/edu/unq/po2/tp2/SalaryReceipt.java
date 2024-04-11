package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class SalaryReceipt {

    //Instance Variables
    private LocalDate dateOfIssue;

    //Constructor
    public SalaryReceipt(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    //Getters
    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    //Methods
    public String getEmployeeName(Employee employee){
        return employee.getName();
    }

    public String getEmployeeAddress(Employee employee){
        return employee.getAddress();
    }
}
