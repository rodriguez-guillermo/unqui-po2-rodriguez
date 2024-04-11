package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperator {

    private List<Integer> numbers = new ArrayList<Integer>();

    public List<Integer> getNumbers(){
        return numbers;
    }

    public void addNumber(Integer i) {
        this.getNumbers().add(i);
    }

    public Integer sumNumbers(){
        return this.getNumbers().stream().mapToInt(Integer::intValue).sum();
    }

    public Integer subtractNumbers(){
        return  this.getNumbers().stream().mapToInt(integer -> integer.intValue()).reduce(0, (x,y) -> x - y);
    }

    public Integer multiplyNumbers(){
        return this.getNumbers().stream().mapToInt(integer -> integer.intValue()).reduce(1, (x,y) -> x * y);
    }
}
