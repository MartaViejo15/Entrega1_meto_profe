package es.uah.matcomp.mp.e1.c.herencia.e3_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(2);
    Cylinder c3 = new Cylinder(10,3);

    @Test
    void getHeight() {
        assertEquals(1.0,c1.getHeight());
    }

    @Test
    void setHeight() {
        c3.setHeight(5.0);
        assertEquals(5.0,c3.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals(6.283185307179586,c2.getVolume());
    }

    @Test
    void getArea() {
        assertEquals(12.566370614359172,c1.getArea());
    }

    @Test
    void testToString() {
        assertEquals("Cylinder: subclass of Circle[radius=10.0, color=red] height=3.0",c3.toString());
    }
}