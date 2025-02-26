package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.GeoResInterfaces;

public class TestCircle {
    public static void main(String[] args) {

        Circle Cir1 = new Circle(7);
        System.out.println(Cir1);

        System.out.println(Cir1.getArea());
        System.out.println(Cir1.getPerimeter());
    }
}
