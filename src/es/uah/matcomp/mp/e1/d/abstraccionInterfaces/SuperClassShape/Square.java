package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.SuperClassShape;

public class Square extends Rectangle {

    public Square(){}
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
