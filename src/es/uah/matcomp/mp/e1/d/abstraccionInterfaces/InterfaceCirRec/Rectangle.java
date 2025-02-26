package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.InterfaceCirRec;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }
}

