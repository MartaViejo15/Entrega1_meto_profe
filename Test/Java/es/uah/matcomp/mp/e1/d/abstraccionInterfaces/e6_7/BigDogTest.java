package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    BigDog bd = new BigDog();
    Dog d = new Dog();

    @Test
    void greeting() {
        bd.greeting();
    }

    @Test
    void testGreeting() {
        bd.greeting(d);
    }
}