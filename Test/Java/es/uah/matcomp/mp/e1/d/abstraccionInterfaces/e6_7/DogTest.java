package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    Dog dog1 = new Dog();
    Dog dog2 = new Dog();

    @Test
    void greeting() {
        dog1.greeting();
    }

    @Test
    void testGreeting() {
        dog1.greeting(dog2);
    }
}