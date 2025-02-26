package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.SuperClassShape;

import org.junit.jupiter.api.Test;

class SquareTest {

    Square Sq1 = new Square(3);
    Square Sq2 = new Square(5, "red", true);
    Square Sq3 = new Square();

    @Test
    void getSide() {
        System.out.println(Sq1.getSide());
    }

    @Test
    void setSide() {
        Sq1.setSide(5);
        System.out.println(Sq1.getSide());
    }

    @Test
    void setWidth() {
        Sq1.setWidth(6);
        System.out.println(Sq1.getWidth());
    }

    @Test
    void setLength() {
        Sq1.setLength(5);
        System.out.println(Sq1.getLength());
    }

    @Test
    void testToString() {
        System.out.println(Sq1.toString());
    }
}