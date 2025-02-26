package es.uah.matcomp.mp.e1.c.herencia.e3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Point2DTest {
    Point2D p = new Point2D();
    Point2D p2 = new Point2D(0,0);

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

    @Test
    void getXY() {
        assertEquals(0,p.getXY()[0]);
        assertEquals(0,p.getXY()[1]);
    }

    @Test
    void testToString() {
        assertEquals(p.toString(),p2.toString());
    }
}