package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_1;

import org.junit.jupiter.api.Test;

class ShapeTest {

    Shape Sh1 = new Circle(5, "red", true);
    Shape Sh2 = new Circle();
    @Test
    void getColor() {
        System.out.println(Sh1.getColor());
    }

    @Test
    void setColor() {
        Sh1.setColor("blue");
        System.out.println(Sh1.getColor());
    }

    @Test
    void isFilled() {
        System.out.println(Sh1.isFilled());
    }

    @Test
    void setFilled() {
        Sh1.setFilled(false);
        System.out.println(Sh1.isFilled());
    }

    @Test
    void getArea() {
        System.out.println(Sh1.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println(Sh1.getPerimeter());
    }

    @Test
    void testToString() {
        System.out.println(Sh1.toString());
    }
}