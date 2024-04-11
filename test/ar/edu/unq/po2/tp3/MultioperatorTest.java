package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultioperatorTest {

    private Multioperator multiop;
    @BeforeEach
    public void setUp(){
        multiop = new Multioperator();

        multiop.addNumber(1);
        multiop.addNumber(2);
        multiop.addNumber(3);
        multiop.addNumber(4);
        multiop.addNumber(5);
    }

    @Test
    public void testGetNumbers(){

        List<Integer> numbersList = Arrays.asList(1,2,3,4,5);

        assertEquals(numbersList, multiop.getNumbers());
    }

    @Test
    public void testSumNumbers(){

        assertEquals(15, multiop.sumNumbers());
    }

    @Test
    public void testSubtractNumbers(){

        assertEquals(-15, multiop.subtractNumbers());
    }

    @Test
    public void testMultiplyNumbers(){

        assertEquals(120, multiop.multiplyNumbers());
    }
}