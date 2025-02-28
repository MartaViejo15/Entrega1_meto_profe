package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_2;

public class InterfaceCirRecTest {
    public static void main(String[] args) {
        GeometricObject Cir1 = new Circle(5);
        System.out.println(Cir1);
        System.out.println(Cir1.getArea());
        System.out.println(Cir1.getPerimeter());

        GeometricObject Rec1 = new Rectangle(5, 5);
        System.out.println(Rec1);
        System.out.println(Rec1.getArea());
        System.out.println(Rec1.getPerimeter());
    }
}
