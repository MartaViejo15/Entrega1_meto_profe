package es.uah.matcomp.mp.e1.c.herencia.e4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {
    Point p = new Point(0,0);

    @Test
    void testToString() {
        assertEquals("(0,0)", p.toString());
    }

    @Test
    void getX() {
        assertEquals(0,p.getX());
    }

    @Test
    void setX() {
        p.setX(1);
        assertEquals(1,p.getX());
    }

    @Test
    void getY() {
        assertEquals(0,p.getY());
    }

    @Test
    void setY() {
        p.setY(1);
        assertEquals(1,p.getY());
    }

    @Test
    void setXY() {
        p.setXY(1,1);
        assertEquals(1,p.getX());
        assertEquals(1,p.getY());
    }
}