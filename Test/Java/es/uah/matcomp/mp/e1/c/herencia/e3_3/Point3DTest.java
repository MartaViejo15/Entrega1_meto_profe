package es.uah.matcomp.mp.e1.c.herencia.e3_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Point3DTest {
    Point3D p=new Point3D();
    Point3D p1=new Point3D(0,0,0);

    @Test
    void getZ() {
        assertEquals(0,p.getZ());
    }

    @Test
    void setZ() {
        p.setZ(10);
        assertEquals(10,p.getZ());
    }

    @Test
    void setXYZ() {
        p.setXYZ(1,1,1);
        assertEquals(1,p.getX());
        assertEquals(1,p.getY());
        assertEquals(1,p.getZ());
    }

    @Test
    void getXYZ() {
        assertEquals(0,p.getXYZ()[0]);
        assertEquals(0,p.getXYZ()[1]);
        assertEquals(0,p.getXYZ()[2]);
    }

    @Test
    void testToString() {
        assertEquals(p.toString(),p1.toString());
    }
}