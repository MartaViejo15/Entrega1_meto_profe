package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.Animal;

import org.junit.jupiter.api.Test;

class AnimalTest {

    Animal An1 = new Animal("Elefante") {
    };

    @Test
    void greets() {
        An1.greets();
    }
}