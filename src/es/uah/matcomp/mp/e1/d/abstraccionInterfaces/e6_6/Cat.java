package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Meow");
    }
}
