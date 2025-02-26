package es.uah.matcomp.mp.e1.c.herencia.e3_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DogTest {
    Dog d = new Dog("perro");
    Dog d2 = new Dog("per");

    @Test
    void greets() {
        d.greets();
    }

    @Test
    void testGreets() {
        d.greets(d2);
    }

    @Test
    void testToString() {
        assertEquals("Dog[Mammal[Animal[name=perro]]]", d.toString());
    }
}