package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private LocalDate date1 = LocalDate.of(1987, 9, 7);
    private LocalDate date2 = LocalDate.of(2000, 2, 5);
    Person person1 = new Person("Rolo", date1);
    Person person2 = new Person("Pepe", date2);
    @Test
    void getName() {
        assertEquals("Rolo", person1.getName());
        assertEquals("Pepe", person2.getName());
    }

    @Test
    void getDateOfBirth() {
        assertEquals(date1, person1.getDateOfBirth());
        assertEquals(date2, person2.getDateOfBirth());
    }

    @Test
    void calculateAge() {
        assertEquals(36, person1.calculateAge());
        assertEquals(24, person2.calculateAge());
    }

    @Test
    void isYoungerThan() {
        assertTrue(person2.isYoungerThan(person1));
        assertFalse(person1.isYoungerThan(person2));
    }
}