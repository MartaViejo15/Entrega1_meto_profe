package es.uah.matcomp.mp.e1.c.herencia.e3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    Point p = new Point();
    Point p2 = new Point(1,1);

    @Test
    void getX() {
        assertEquals(0,p.getX());
    }

    @Test
    void setX() {
        p.setX(2);
        assertEquals(2,p.getX());
    }

    @Test
    void getY() {
        assertEquals(0,p.getY());
    }

    @Test
    void setY() {
        p.setY(2);
        assertEquals(2,p.getY());
    }

    @Test
    void setXY() {
        p.setXY(2,2);
        assertEquals(2,p.getX());
        assertEquals(2,p.getY());
    }

    @Test
    void getXY() {
        assertEquals(1,p2.getXY()[0]);
    }

    @Test
    void testToString() {
        assertEquals("(1.0, 1.0)",p2.toString());
    }
}