package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void newPointWithReferences() {

        Point point = new Point(4,5);

        assertEquals(4, point.getX());
        assertEquals(5,point.getY());
    }

    @Test
    void newPointWithoutReferences() {

        Point point = new Point();

        assertEquals(0, point.getX());
        assertEquals(0,point.getY());

        point.setXY(7,9);
        assertEquals(7, point.getX());
        assertEquals(9,point.getY());
    }

    @Test
    void addPoints(){

        Point point1 = new Point(1,4);
        Point point2 = new Point(3,1);

        Point newPoint = point1.addPoints(point2);

        assertEquals(4, newPoint.getX());
        assertEquals(5, newPoint.getY());
    }

}