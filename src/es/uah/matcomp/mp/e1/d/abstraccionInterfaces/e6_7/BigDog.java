package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

public class BigDog extends Dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }
    @Override
    public void greeting(Dog another) {
        System.out.println("Woooooowwwww!");
    }
}
