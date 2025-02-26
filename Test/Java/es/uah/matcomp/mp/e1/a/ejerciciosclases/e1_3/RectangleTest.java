package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle(2.0f,3.0f);

    @Test
    void getLength() {
        assertEquals(2.0f, r2.getLength());
    }

    @Test
    void setLength() {
        r1.setLength(5.0f);
        assertEquals(5.0f, r1.getLength());
    }

    @Test
    void getWidth() {
        assertEquals(3.0f, r2.getWidth());
    }

    @Test
    void setWidth() {
        r1.setWidth(5.0f);
        assertEquals(5.0f, r1.getWidth());
    }

    @Test
    void getArea() {
        assertEquals(6.0f, r2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(4.0f, r1.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Rectangle [length=2.0, width=3.0]", r2.toString());
    }
}