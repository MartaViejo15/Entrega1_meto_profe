package es.uah.matcomp.mp.e1.c.herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShapeTest {
    Shape s1 = new Shape();
    Shape s2 = new Shape("red",false);

    @Test
    void getColor() {
        assertEquals("red",s1.getColor());
    }

    @Test
    void setColor() {
        s1.setColor("azul");
        assertEquals("azul",s1.getColor());
    }

    @Test
    void isFilled() {
        assertTrue(s1.isFilled());
    }

    @Test
    void setFilled() {
        s1.setFilled(true);
        assertTrue(s1.isFilled());
    }

    @Test
    void testToString() {
        assertEquals("Shape[color=red, filled=true]", s1.toString());
    }
}