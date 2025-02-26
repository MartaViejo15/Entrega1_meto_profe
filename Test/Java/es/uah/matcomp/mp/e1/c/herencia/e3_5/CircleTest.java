package es.uah.matcomp.mp.e1.c.herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle c = new Circle();
    Circle c2 = new Circle(2);
    Circle c3 = new Circle(3,"red",true);

    @Test
    void getRadius() {
        assertEquals(1,c.getRadius());
    }

    @Test
    void setRadius() {
        c.setRadius(2);
        assertEquals(2,c.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(3.141592653589793,c.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(6.283185307179586,c.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle[Shape[color=red, filled=true], radius=1.0]", c.toString());
    }
}