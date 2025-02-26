package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.Animal;

import org.junit.jupiter.api.Test;

class DogTest {

    Dog dog = new Dog("Felix");


    Dog dog2 = new Dog("Escoby");

    @Test
    void greets() {
        dog.greets();
    }

    @Test
    void testGreets() {
        dog.greets(dog2);
    }
}