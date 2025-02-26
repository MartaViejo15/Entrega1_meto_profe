package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(2);
    Circle c3 = new Circle(3,"azul");

    @Test
    void getRadius() {
        assertEquals(1.0,c1.getRadius());
    }

    @Test
    void getArea() {
        assertEquals(12.566370614359172,c2.getArea());
    }

    @Test
    void getColor() {
        assertEquals("azul",c3.getColor());
    }

    @Test
    void setRadius() {
        c1.setRadius(5);
        assertEquals(5,c1.getRadius());
    }

    @Test
    void setColor() {
        c2.setColor("azul");
        assertEquals("azul",c2.getColor());
    }

    @Test
    void testToString() {
        assertEquals("Circle[radius=2.0 color=red]",c2.toString());
    }
}