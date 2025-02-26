package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.Animal;

import org.junit.jupiter.api.Test;

class BigDogTest {

    BigDog bigDog = new BigDog("Pedro");

    Dog dog2 = new Dog("Bob");

    BigDog bigDog2 = new BigDog("Joan");

    @Test
    void greets() {
        bigDog.greets();
    }

    @Test
    void testGreets() {
        bigDog.greets(dog2);
    }

    @Test
    void testGreets1() {
        bigDog.greets(bigDog2);
    }
}