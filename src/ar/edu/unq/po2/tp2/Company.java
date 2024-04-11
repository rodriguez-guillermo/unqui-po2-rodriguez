package ar.edu.unq.po2.tp2;

import java.util.ArrayList;
import java.util.List;

public class Company {

    //Instance Variables
    private String name;
    private String cuit;
    private List<Employee> employees;

    //Constructor
    public Company(String name, String cuit){
        this.setName(name);
        this.setCuit(cuit);
        this.employees = new ArrayList<Employee>();
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getCuit() {
        return cuit;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    //Methods
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public Double totalNetSalaries(){
        Double totalNetSum = 0.0;
        for (Employee employee : employees){
            totalNetSum += employee.netSalary();
        }
        return totalNetSum;
    }

    public Double totalGrossSalaries(){
        Double totalGrossSum = 0.0;
        for (Employee employee : employees){
            totalGrossSum += employee.grossSalary();
        }
        return totalGrossSum;
    }

    public Double totalDeductions(){
        Double totalDeductionsSum = 0.0;
        for (Employee employee : employees){
            totalDeductionsSum += employee.deductions();
        }
        return totalDeductionsSum;
    }

    public void salariesPayoff(){
        for (Employee employee : employees){
            employee.createSalaryReceipt();
        }
    }
}
