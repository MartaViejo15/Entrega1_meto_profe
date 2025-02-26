package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.Animal;

public class AnimalTest {
    public static void main(String[] args) {

        Cat Cat = new Cat("Lolo");
        Cat.greets();

        Dog dog = new Dog("Felix");
        dog.greets();

        Dog dog2 = new Dog("Escoby");
        dog.greets(dog2);

        BigDog bigDog = new BigDog("Pedro");
        bigDog.greets();

        bigDog.greets(dog2);

        BigDog bigDog2 = new BigDog("Joan");
        bigDog.greets(bigDog2);

    }
}
