package es.uah.matcomp.mp.e1.c.herencia.e4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(1);
    Circle c3 = new Circle(1,"red");

    @Test
    void getRadius() {
        assertEquals(1,c1.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(3.141592653589793,c1.getArea());
    }

    @Test
    void getColor() {
        assertEquals("black",c1.getColor());
    }

    @Test
    void setRadius() {
        c1.setRadius(2);
        assertEquals(2,c1.getRadius());
    }

    @Test
    void setColor() {
        c2.setColor("azul");
        assertEquals("azul",c2.getColor());
    }

    @Test
    void getPerimeter() {
        assertEquals(6.283185307179586,c3.getPerimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=1.0, color= null]",c2.toString());
    }
}