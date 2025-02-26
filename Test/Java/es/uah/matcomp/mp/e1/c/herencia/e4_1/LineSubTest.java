package es.uah.matcomp.mp.e1.c.herencia.e4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineSubTest {
    LineSub l = new LineSub(1,1,2,2);

    @Test
    void testToString() {
        assertEquals("LineSub[begin=(1,1), end=(2,2)]",l.toString());
    }

    @Test
    void getBegin() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        LineSub l1 = new LineSub(p1,p2);
        assertEquals(p1.toString(),l1.getBegin().toString());
    }

    @Test
    void setBegin() {
        l.setBegin(0,0);
        assertEquals(0,l.getBeginX());
        assertEquals(0,l.getBeginY());
    }

    @Test
    void getEnd() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);
        LineSub l1 = new LineSub(p1,p2);
        assertEquals(p2,l1.getEnd());
    }

    @Test
    void setEnd() {
        l.setEnd(10,10);
        assertEquals(10,l.getEndX());
        assertEquals(10,l.getEndY());
    }

    @Test
    void getBeginX() {
        assertEquals(1,l.getBeginX());
    }

    @Test
    void setBeginX() {
        l.setBeginX(0);
        assertEquals(0,l.getBeginX());
    }

    @Test
    void getBeginY() {
        assertEquals(1,l.getBeginY());
    }

    @Test
    void setBeginY() {
        l.setBeginY(0);
        assertEquals(0,l.getBeginY());
    }

    @Test
    void getEndX() {
        assertEquals(2,l.getEndX());
    }

    @Test
    void setEndX() {
        l.setEndX(10);
        assertEquals(10,l.getEndX());
    }

    @Test
    void getEndY() {
        assertEquals(2,l.getEndY());
    }

    @Test
    void setEndY() {
        l.setEndY(10);
        assertEquals(10,l.getEndY());
    }

    @Test
    void setBeginXY() {
        l.setBeginXY(0,0);
        assertEquals(0,l.getBeginX());
        assertEquals(0,l.getBeginY());
    }

    @Test
    void setEndXY() {
        l.setEndXY(10,10);
        assertEquals(10,l.getEndX());
        assertEquals(10,l.getEndY());
    }

    @Test
    void getLength() {
        assertEquals(1.0,l.getLength());
    }

    @Test
    void getGradient() {
        assertEquals(0.7853981633974483,l.getGradient());
    }
}