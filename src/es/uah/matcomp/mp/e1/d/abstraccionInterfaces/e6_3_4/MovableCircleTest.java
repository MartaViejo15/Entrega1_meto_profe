package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_3_4;

public class MovableCircleTest {
    public static void main(String[] args) {

        MovableCircle MCir = new MovableCircle(3,3,4,5,3);

        System.out.println(MCir);

        MCir.moveUp();
        System.out.println(MCir);

        MCir.moveDown();
        System.out.println(MCir);

        MCir.moveLeft();
        System.out.println(MCir);

        MCir.moveRight();
        System.out.println(MCir);
    }
}
