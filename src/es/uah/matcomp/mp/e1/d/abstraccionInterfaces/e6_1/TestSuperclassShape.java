package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_1;

public class TestSuperclassShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // Version of Circle
        System.out.println(s1.getPerimeter()); // Version of circle
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // No funciona porque no encuentra el metodo en la clase Shape al usar el constructor de la misma clase
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        //Shape s2 = new Shape(); // No funciona porque al ser una clase abstracta no puede ser especificado el constructor
        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // No funciona porque no encuentra el metodo en la clase Shape al usar el constructor de la misma clase
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // No funciona porque no encuentra el metodo en la clase Shape al usar el constructor de la misma clase
// Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // No funciona porque no encuentra el metodo en la clase Shape ni en la clase Rectangle al usar el constructor de la misma clase
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        /* Los casos de polimorfismo son los métodos gerArea() y
        getPerimeter() porque se usa el mismo nombre para el metodo
        en las distintas clases, al utilizar el constructor correcto
        utiliza el metodo de la clase en la que está este */

        // En tus palabras, ¿para qué sirven las clases abstractas y los métodos abstractos?

        /* Las clases abstractas sirven para poder utilizar varios
        metodos con el mismo nombre, segun el constructor de la clase
        que se utilice. Esto permite reutilizar los metodos de forma
        mas sencilla
         */
    }
}
