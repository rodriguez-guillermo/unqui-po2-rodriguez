package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    private Counter counter;
    @BeforeEach
    void setUp(){

        //Se crea el contador
        counter = new Counter();

    //Se agregan los numeros. Un solo par y nueve impares
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    @Test
    public void testEvenNumbers() {
    // Getting the even occurrences
        Integer amount = counter.getEvenOcurrences();
    // I check the amount is the expected one
        assertEquals(amount, 1);
    }

    @Test
    public void testOddNumbers() {

        Integer amount = counter.getOddOcurrences();
        // I check the amount is the expected one
        assertEquals(amount, 9);
    }

    @Test
    public void TestMultipliersOf(){

        assertEquals(counter.getMultipliersOf(1), 10);
        assertEquals(counter.getMultipliersOf(2), 1);
        assertEquals(counter.getMultipliersOf(5), 1);
        assertEquals(counter.getMultipliersOf(10), 0);
    }

}