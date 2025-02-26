package es.uah.matcomp.mp.e1.b.composicionagregacion.e2_6_7_8_9;

public class TestMyPoint {
    public static void main(String[] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(4,5); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
        // Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // distance(MyPoint another), distance from p1 (3,0) to p2 (0,4)
        System.out.println(p2.distance(p1)); // distance(MyPoint another), distance from p2 (0,4) to p1 (3,0)
        System.out.println(p1.distance(5, 6)); // distance(int x, int y), distance from p1 (3,0) to given point (5,6)
        System.out.println(p1.distance()); // distance(), distance from p1 (3,0) to origin
        MyPoint p3 = new MyPoint();
        System.out.println(p3);

        /*Escribe ahora un programa que instancie un array de 10 puntos MyPoint, inicializados como (1,1), (2,2)...(10,10).
        Muestra la matriz de distancias entre todos ellos.*/
        MyPoint[] array = new MyPoint[10];
        array[0] = new MyPoint(1,1);
        array[1] = new MyPoint(2,2);
        array[2] = new MyPoint(3,3);
        array[3] = new MyPoint(4,4);
        array[4] = new MyPoint(5,5);
        array[5] = new MyPoint(6,6);
        array[6] = new MyPoint(7,7);
        array[7] = new MyPoint(8,8);
        array[8] = new MyPoint(9,9);
        array[9] = new MyPoint(10,10);
        for (int i = 0; i < 10; i++) {
            System.out.print("(");
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i].distance(array[j])+" ");
            }
            System.out.println(")");
        }
    }
}
