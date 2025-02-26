package es.uah.matcomp.mp.e1.a.ejerciciosclases.e1_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {
    Time t1 = new Time(23,59,58);

    @Test
    void getHour() {
        assertEquals(23,t1.getHour());
    }

    @Test
    void setHour() {
        t1.setHour(2);
        assertEquals(2,t1.getHour());
    }

    @Test
    void getMinute() {
        assertEquals(59,t1.getMinute());
    }

    @Test
    void setMinute() {
        t1.setMinute(3);
        assertEquals(3,t1.getMinute());
    }

    @Test
    void getSecond() {
        assertEquals(58,t1.getSecond());
    }

    @Test
    void setSecond() {
        t1.setSecond(5);
        assertEquals(5,t1.getSecond());
    }

    @Test
    void setTime() {
        t1.setTime(10,20,30);
        assertEquals(10,t1.getHour());
        assertEquals(20,t1.getMinute());
        assertEquals(30,t1.getSecond());
    }

    @Test
    void testToString() {
        assertEquals("23:59:58",t1.toString());
    }

    @Test
    void nextSecond() {
        t1.nextSecond();
        assertEquals(59,t1.getSecond());
        t1.nextSecond();
        assertEquals(0,t1.getSecond());
        assertEquals(0,t1.getMinute());
        assertEquals(0,t1.getHour());
        Time t2 = new Time(10,59,59);
        t2.nextSecond();
        assertEquals(11,t2.getHour());
        Time t3 = new Time(11,10,59);
        t3.nextSecond();
        assertEquals(11,t3.getMinute());
    }

    @Test
    void previousSecond() {
        t1.previousSecond();
        assertEquals(57,t1.getSecond());
        Time t2 = new Time(0,0,0);
        t2.previousSecond();
        assertEquals(59,t2.getSecond());
        assertEquals(59,t2.getMinute());
        assertEquals(23,t2.getHour());
        Time t3 = new Time(10,0,0);
        t3.previousSecond();
        assertEquals(9,t3.getHour());
        Time t4 = new Time(10,10,0);
        t4.previousSecond();
        assertEquals(9,t4.getMinute());
    }
}