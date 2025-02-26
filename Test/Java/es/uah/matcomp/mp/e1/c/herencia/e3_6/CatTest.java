package es.uah.matcomp.mp.e1.c.herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CatTest {
    Cat c = new Cat("c");

    @Test
    void greets() {
        c.greets();
    }

    @Test
    void testToString() {
        assertEquals("Cat[Mammal[Animal[name=c]]]", c.toString());
    }
}