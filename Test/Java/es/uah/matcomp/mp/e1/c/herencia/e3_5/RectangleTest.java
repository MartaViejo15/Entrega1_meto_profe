package es.uah.matcomp.mp.e1.c.herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(1,1);
    Rectangle r3 = new Rectangle(1,1,"red",true);

    @Test
    void getWidth() {
        assertEquals(1,r1.getWidth());
    }

    @Test
    void setWidth() {
        r2.setWidth(4);
        assertEquals(4,r2.getWidth());
    }

    @Test
    void getLength() {
        assertEquals(1,r1.getLength());
    }

    @Test
    void setLength() {
        r2.setLength(4);
        assertEquals(4,r2.getLength());
    }

    @Test
    void getArea() {
        assertEquals(1,r1.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(4,r1.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals(r1.toString(),r2.toString());
    }
}