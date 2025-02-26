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
        Time t2 = new Time(2,5,5);
        assertEquals("02:05:05",t2.toString());
        Time t3 = new Time(1,2,20);
        assertEquals("01:02:20",t3.toString());
        Time t4 = new Time(1,20,20);
        assertEquals("01:20:20",t4.toString());
        Time t5 = new Time(1,20,2);
        assertEquals("01:20:02",t5.toString());
        Time t6 = new Time(10,20,2);
        assertEquals("10:20:02",t6.toString());
        Time t7 = new Time(10,2,2);
        assertEquals("10:02:02",t7.toString());
        Time t8 = new Time(10,2,20);
        assertEquals("10:02:20",t8.toString());
    }

    @Test
    void nextSecond() {
        t1.nextSecond();
        assertEquals(59,t1.getSecond());
        t1.nextSecond();
        assertEquals(0,t1.getSecond());
        assertEquals(0,t1.getMinute());
        assertEquals(0,t1.getHour());
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
    }
}