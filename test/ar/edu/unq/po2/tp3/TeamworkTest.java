package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TeamworkTest {

    private Teamwork teamwork = new Teamwork("POO2");
    private LocalDate date1 = LocalDate.of(1987, 9, 7);
    private LocalDate date2 = LocalDate.of(2000, 2, 5);
    private LocalDate date3 = LocalDate.of(2006, 12, 20);
    private LocalDate date4 = LocalDate.of(1978, 1, 27);
    private LocalDate date5 = LocalDate.of(1995, 6, 15);
    Person person1 = new Person("Rolo", date1);
    Person person2 = new Person("Pepe", date2);
    Person person3 = new Person("Juan", date3);
    Person person4 = new Person("Raul", date4);
    Person person5 = new Person("Toto", date5);

    @BeforeEach
    void setUp(){
    teamwork.addEmployee(person1);
    teamwork.addEmployee(person2);
    teamwork.addEmployee(person3);
    teamwork.addEmployee(person4);
    teamwork.addEmployee(person5);
    }
    @Test
    void addEmployee() {
        teamwork.getEmployees().clear();

        teamwork.addEmployee(person1);
        assertEquals(1, teamwork.getEmployees().size());
        teamwork.addEmployee(person2);
        assertEquals(2, teamwork.getEmployees().size());
    }

    @Test
    void getName() {
        assertEquals("POO2", teamwork.getName());
    }

    @Test
    void getEmployees() {
        List<Person> listTest = Arrays.asList(person1, person2, person3, person4, person5);
        assertEquals(listTest, teamwork.getEmployees());
    }

    @Test
    void calculateAvgAge() {

        assertEquals(36, person1.calculateAge());
        assertEquals(24, person2.calculateAge());
        assertEquals(17, person3.calculateAge());
        assertEquals(46, person4.calculateAge());
        assertEquals(28, person5.calculateAge());

        // (36 + 24 + 17 + 46 + 28) / 5 = 30.2

        assertEquals(30.2, teamwork.calculateAvgAge());
    }
}