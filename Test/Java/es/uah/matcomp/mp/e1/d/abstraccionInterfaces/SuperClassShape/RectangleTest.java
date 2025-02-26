package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.SuperClassShape;

import org.junit.jupiter.api.Test;

class RectangleTest {

    Rectangle Rec1 = new Rectangle(5, 5);
    Rectangle Rec2 = new Rectangle();
    Rectangle Rec3 = new Rectangle(3,3, "red", true);

    @Test
    void getWidth() {
        System.out.println(Rec1.getWidth());
    }

    @Test
    void setWidth() {
        Rec1.setWidth(10);
        System.out.println(Rec1.getWidth());
    }

    @Test
    void getLength() {
        System.out.println(Rec1.getLength());
    }

    @Test
    void setLength() {
        Rec1.setLength(10);
        System.out.println(Rec1.getLength());
    }

    @Test
    void getArea() {
        System.out.println(Rec1.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println(Rec1.getPerimeter());
    }

    @Test
    void testToString() {
        System.out.println(Rec1.toString());
    }
}