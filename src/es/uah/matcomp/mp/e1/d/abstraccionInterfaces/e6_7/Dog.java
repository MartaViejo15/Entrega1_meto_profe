package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

public class Dog extends Animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(Dog another) {
        System.out.println("Woooooooooof!");
    }
}
