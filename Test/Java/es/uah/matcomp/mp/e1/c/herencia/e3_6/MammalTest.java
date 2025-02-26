package es.uah.matcomp.mp.e1.c.herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MammalTest {
    Mammal m = new Mammal("Mamifero");

    @Test
    void testToString() {
        assertEquals("Mammal[Animal[name=Mamifero]]", m.toString());
    }
}