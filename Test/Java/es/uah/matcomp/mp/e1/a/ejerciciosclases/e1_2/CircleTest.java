package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(2);

    @Test
    void getRadius() {
        assertEquals(2,c2.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(3);
        assertEquals(3,c1.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(3.141592653589793,c1.getArea());
    }

    @Test
    void getCircumference() {
        assertEquals(6.2831854820251465,c1.getCircumference());
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=2.0]",c2.toString());
    }
}