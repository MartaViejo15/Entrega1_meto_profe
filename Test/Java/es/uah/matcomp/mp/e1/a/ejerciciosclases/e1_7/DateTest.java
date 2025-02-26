package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTest {
    Date d = new Date(1,2,1023);

    @Test
    void getDay() {
        assertEquals(1,d.getDay());
    }

    @Test
    void getMonth() {
        assertEquals(2,d.getMonth());
    }

    @Test
    void getYear() {
        assertEquals(1023,d.getYear());
    }

    @Test
    void setDay() {
        d.setDay(3);
        assertEquals(3,d.getDay());
    }

    @Test
    void setMonth() {
        d.setMonth(3);
        assertEquals(3,d.getMonth());
    }

    @Test
    void setYear() {
        d.setYear(2020);
        assertEquals(2020,d.getYear());
    }

    @Test
    void setDate() {
        d.setDate(10,1,2000);
        assertEquals(10,d.getDay());
        assertEquals(1,d.getMonth());
        assertEquals(2000,d.getYear());
    }

    @Test
    void testToString() {
        assertEquals("01/02/1023",d.toString());
    }
}