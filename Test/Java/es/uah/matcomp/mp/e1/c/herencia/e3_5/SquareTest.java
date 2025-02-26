package es.uah.matcomp.mp.e1.c.herencia.e3_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {
    Square s1 = new Square();
    Square s2 = new Square(1);
    Square s3 = new Square(1,"red",true);

    @Test
    void getSide() {
        assertEquals(1,s1.getSide());
    }

    @Test
    void setSide() {
        s1.setSide(2);
        assertEquals(2,s1.getSide());
    }

    @Test
    void setWidth() {
        s1.setWidth(3);
        assertEquals(3,s1.getSide());
    }

    @Test
    void setLength() {
        s1.setLength(3);
        assertEquals(3,s1.getSide());
    }

    @Test
    void testToString() {
        assertEquals(s1.toString(),s2.toString());
    }
}