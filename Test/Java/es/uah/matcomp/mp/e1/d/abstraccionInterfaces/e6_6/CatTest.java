package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_6;

import org.junit.jupiter.api.Test;

class CatTest {

    Cat cat = new Cat("Lolo");

    @Test
    void greets() {
        cat.greets();
    }
}