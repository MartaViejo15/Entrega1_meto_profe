package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.InterfaceMov;

public class MovablePointTest {
    public static void main(String[] args) {

        MovablePoint MP1 = new MovablePoint(2,2,5,5);

        System.out.println(MP1);

        MP1.moveDown();
        System.out.println(MP1);

        MP1.moveUp();
        System.out.println(MP1);

        MP1.moveLeft();
        System.out.println(MP1);

        MP1.moveRight();
        System.out.println(MP1);

    }
}
