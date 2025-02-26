package es.uah.matcomp.mp.e1.c.herencia.e3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle c = new Circle();
    Circle c2 = new Circle(2);
    Circle c3 = new Circle(3,"red");

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
    void testToString() {
        assertEquals("Circle[radius=1.0, color=red]", c.toString());
    }

    @Test
    void getColor() {
        assertEquals(c2.getColor(),c.getColor());
    }

    @Test
    void setColor() {
        c2.setColor("red");
        assertEquals("red",c2.getColor());
    }
}