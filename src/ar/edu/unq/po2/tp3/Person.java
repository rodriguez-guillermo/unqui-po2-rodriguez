package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate dateOfBirth;

    public Person(String nombre, LocalDate fechaNacimiento){
        this.name = nombre;
        this.dateOfBirth = fechaNacimiento;
    }

    public String getName(){
        return name;
    }

    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    public Integer calculateAge(){
        return Period.between(this.getDateOfBirth(), LocalDate.now()).getYears();
    }

    public boolean isYoungerThan(Person otherPerson){
        return this.calculateAge() < otherPerson.calculateAge();
    }
}
