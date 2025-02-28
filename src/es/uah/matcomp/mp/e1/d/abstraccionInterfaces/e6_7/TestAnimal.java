package es.uah.matcomp.mp.e1.d.abstraccionInterfaces.e6_7;

public class TestAnimal {
    public static void main(String[] args) {
// Using the subclasses //Al usar subclases, se utiliza el metodo de la clase del constructor al que se esta refiriendo
        Cat cat1 = new Cat();
        cat1.greeting(); //Meow!
        Dog dog1 = new Dog();
        dog1.greeting(); //Woof!
        BigDog bigDog1 = new BigDog();
        bigDog1.greeting(); //Woow!
// Using Polymorphism //Al usar polimorfismo, el objeto animal se crea con el constructor de cada clase y al referirse
        Animal animal1 = new Cat(); // a cada objeto, segun el constructor que se ha utilizado, se utiliza el metodo de la clase del constuctor
        animal1.greeting();  // Meow!
        Animal animal2 = new Dog();
        animal2.greeting(); // Woof!
        Animal animal3 = new BigDog();
        animal3.greeting(); // Woow!
        //Animal animal4 = new Animal(); Esto da error!! Porque un constructor de una clase abstracta no puede ser utilizado
// Downcast
        Dog dog2 = (Dog)animal2;
        BigDog bigDog2 = (BigDog)animal3;
        Dog dog3 = (Dog)animal3;
        //Cat cat2 = (Cat)animal2; Da error en el main porqur la clase perro del constructor animal2 no se puede juntar con la clase cat
        dog2.greeting(dog3); //Woooooooooof! porque es el de la clase Dog
        dog3.greeting(dog2); //Woooooowwwww! porque es de la clase Bigdog
        dog2.greeting(bigDog2); //Woooooooooof! porque es el de la clase Dog
        bigDog2.greeting(dog2); //Woooooowwwww! porque es de la clase Bigdog
        bigDog2.greeting(bigDog1); //Woooooowwwww! porque es de la clase Bigdog
    }
}
