package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.GeoResInterfaces;

public class ResizableCircleTest {
    public static void main(String[] args) {

        ResizableCircle RCir1 = new ResizableCircle(5);
        System.out.println(RCir1);

        RCir1.resize(50);
        System.out.println(RCir1);
    }
}
