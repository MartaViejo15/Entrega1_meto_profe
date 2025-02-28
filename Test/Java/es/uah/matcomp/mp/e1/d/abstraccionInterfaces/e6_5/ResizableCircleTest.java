package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_5;

import org.junit.jupiter.api.Test;

class ResizableCircleTest {

    ResizableCircle RCir1 = new ResizableCircle(5);

    @Test
    void testToString() {
        System.out.println(RCir1.toString());
    }

    @Test
    void resize() {
        RCir1.resize(20);
        System.out.println(RCir1.toString());
    }
}