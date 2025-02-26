package es.uah.matcomp.mp.e1.c.herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnimalTest {

    @Test
    void testToString() {
        Animal a = new Animal("A");
        assertEquals("Animal[name=A]", a.toString());
    }
}