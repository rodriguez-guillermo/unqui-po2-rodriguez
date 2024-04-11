package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Teamwork {

    private String name;
    private List<Person> employees = new ArrayList<Person>();

    public Teamwork(String name, List<Person> employees) {
        this.name = name;
        this.employees = employees;
    }

    public Teamwork(String name){
        this.name = name;
    }

    public void addEmployee(Person person){
        this.getEmployees().add(person);
    }
    public String getName(){
        return this.name;
    }

    public List<Person> getEmployees(){
        return this.employees;
    }

    public double calculateAvgAge(){

        Double sumAges = 0.0;
        for (Person person : employees) {
            sumAges += person.calculateAge();
        }

        return sumAges / employees.size();
    }
}
