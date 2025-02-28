package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Animal cat1 = new Cat();

    @Test
    void greeting() {
        cat1.greeting();
    }
}