package es.uah.matcomp.mp.e1.c.herencia.e3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {
    Person p = new Person("John", "x.com");

    @Test
    void getName() {
        assertEquals("John", p.getName());
    }

    @Test
    void getAddress() {
        assertEquals("x.com", p.getAddress());
    }

    @Test
    void setAddress() {
        p.setAddress("xxx.com");
        assertEquals("xxx.com", p.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Person [name=John, address=x.com]", p.toString());
    }
}