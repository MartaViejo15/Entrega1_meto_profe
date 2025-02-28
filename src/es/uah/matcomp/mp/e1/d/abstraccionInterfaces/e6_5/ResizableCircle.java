package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_5;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Resizable Circle[" + super.toString() + "]";
    }
    @Override
    public void resize(int percent){
        radius *= percent/100;
    }
}
