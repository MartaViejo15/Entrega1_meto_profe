package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void greeting() {
        Animal animal = new Cat();
        animal.greeting();
    }
}