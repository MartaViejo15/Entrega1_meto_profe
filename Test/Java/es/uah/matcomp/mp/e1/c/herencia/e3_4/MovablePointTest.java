package es.uah.matcomp.mp.e1.c.herencia.e3_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovablePointTest {
    MovablePoint mp = new MovablePoint();
    MovablePoint mp2 = new MovablePoint(1,1);
    MovablePoint mp3 = new MovablePoint(1,1,1,1);

    @Test
    void getXSpeed() {
        assertEquals(1, mp2.getXSpeed());
    }

    @Test
    void setXSpeed() {
        mp.setXSpeed(2);
        assertEquals(2, mp.getXSpeed());
    }

    @Test
    void getYSpeed() {
        assertEquals(1, mp3.getYSpeed());
    }

    @Test
    void setYSpeed() {
        mp3.setYSpeed(2);
        assertEquals(2, mp3.getYSpeed());
    }

    @Test
    void setSpeed() {
        mp.setSpeed(3,3);
        assertEquals(3, mp.getXSpeed());
        assertEquals(3, mp.getYSpeed());
    }

    @Test
    void getSpeed() {
        assertEquals(1, mp2.getSpeed()[0]);
        assertEquals(1, mp2.getSpeed()[1]);
    }

    @Test
    void testToString() {
        assertEquals("(0.0, 0.0),speed=([1.0, 1.0])", mp2.toString());
    }

    @Test
    void move() {
        mp3.move();
        assertEquals("(2.0, 2.0),speed=([1.0, 1.0])", mp3.toString());
    }
}