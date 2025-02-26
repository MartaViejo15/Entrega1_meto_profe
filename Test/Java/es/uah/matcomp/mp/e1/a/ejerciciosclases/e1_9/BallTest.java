package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallTest {
    Ball b = new Ball(1,1,1,1,1);

    @Test
    void getX() {
        assertEquals(1,b.getX());
    }

    @Test
    void setX() {
        b.setX(2);
        assertEquals(2,b.getX());
    }

    @Test
    void getY() {
        assertEquals(1,b.getY());
    }

    @Test
    void setY() {
        b.setY(2);
        assertEquals(2,b.getY());
    }

    @Test
    void getRadius() {
        assertEquals(1,b.getRadius());
    }

    @Test
    void setRadius() {
        b.setRadius(2);
        assertEquals(2,b.getRadius());
    }

    @Test
    void getXDelta() {
        assertEquals(1,b.getXDelta());
    }

    @Test
    void setXDelta() {
        b.setXDelta(2);
        assertEquals(2,b.getXDelta());
    }

    @Test
    void getYDelta() {
        assertEquals(1,b.getYDelta());
    }

    @Test
    void setYDelta() {
        b.setYDelta(2);
        assertEquals(2,b.getYDelta());
    }

    @Test
    void move() {
        b.move();
        assertEquals(2,b.getX());
        assertEquals(2,b.getY());
    }

    @Test
    void reflectHorizontal() {
        b.reflectHorizontal();
        b.move();
        assertEquals(0,b.getX());
        assertEquals(2,b.getY());
    }

    @Test
    void reflectVertical() {
        b.reflectVertical();
        b.move();
        assertEquals(2,b.getX());
        assertEquals(0,b.getY());
    }

    @Test
    void testToString() {
        assertEquals("Ball [(1.0, 1.0), speed= (1.0, 1.0)]",b.toString());
    }
}