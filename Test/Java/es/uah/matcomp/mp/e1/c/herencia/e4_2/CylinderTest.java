package es.uah.matcomp.mp.e1.c.herencia.e4_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CylinderTest {
    Cylinder c1 = new Cylinder();
    Cylinder c2 = new Cylinder(1);
    Cylinder c3 = new Cylinder(1,1);
    Cylinder c4 = new Cylinder(1,1,"Blue");

    @Test
    void getHeight() {
        assertEquals(c1.getHeight(), c2.getHeight());
    }

    @Test
    void setHeight() {
        c1.setHeight(2);
        assertEquals(2,c1.getHeight());
    }

    @Test
    void getVolume() {
        assertEquals(3.141592653589793,c1.getVolume());
    }

    @Test
    void testToString() {
        assertEquals("Cylinder[base=Circle[radius=1.0, color= black], height=1.0, volume=3.141592653589793]",c2.toString());
    }

    @Test
    void getRadius() {
        assertEquals(c1.getRadius(),c2.getRadius());
    }

    @Test
    void setRadius() {
        c1.setRadius(2);
        assertEquals(2,c1.getRadius());
    }

    @Test
    void getColor() {
        assertEquals("black",c1.getColor());
    }

    @Test
    void setColor() {
        c4.setColor("red");
        assertEquals("red",c4.getColor());
    }
}