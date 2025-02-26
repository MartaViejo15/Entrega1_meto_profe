package es.uah.matcomp.mp.e1.c.herencia.e3_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StaffTest {
    Staff s = new Staff("Señor X","xxx.com","uah",100);

    @Test
    void getSchool() {
        assertEquals("uah",s.getSchool());
    }

    @Test
    void setSchool() {
        s.setSchool("uam");
        assertEquals("uam",s.getSchool());
    }

    @Test
    void getPay() {
        assertEquals(100,s.getPay());
    }

    @Test
    void setPay() {
        s.setPay(1000);
        assertEquals(1000,s.getPay());
    }

    @Test
    void testToString() {
        assertEquals("Staff[Person [name=Señor X, address=xxx.com], school=uah, pay=100.0]",s.toString());
    }
}