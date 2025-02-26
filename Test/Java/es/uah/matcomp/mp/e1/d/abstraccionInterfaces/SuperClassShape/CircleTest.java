package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.SuperClassShape;

import org.junit.jupiter.api.Test;

class CircleTest {

    Circle Cir1 = new Circle(5);

    @Test
    void getRadius() {
        System.out.println(Cir1.getRadius());
    }

    @Test
    void setRadius() {
        Cir1.setRadius(10);
        System.out.println(Cir1);
    }

    @Test
    void getArea() {
        System.out.println(Cir1.getArea());
    }

    @Test
    void getPerimeter() {
        System.out.println(Cir1.getPerimeter());
    }

    @Test
    void testToString() {
        System.out.println(Cir1.toString());
    }
}