package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    private List<Integer> numbers = new ArrayList<>();

    private List<Integer> getNumbers(){
        return this.numbers;
    }
    public void addNumber(Integer number) {
        this.getNumbers().add(number);
    }

    public Integer getEvenOcurrences(){
        return this.getNumbers().stream().filter(number -> number % 2 == 0).toList().size();
    }

    public Integer getMultipliersOf(Integer i) {
        return this.numbers.stream().filter(number -> number % i == 0).toList().size();
    }

    public Integer getOddOcurrences() {
        return this.getNumbers().size() - this.getEvenOcurrences();
    }
}
