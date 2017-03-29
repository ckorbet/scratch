package scratch.classcomparator;

public class MainComparator {

    public static final void main(final String args[]) {
        final Animal animal = new Animal();
        //final Animal dog = new Dog();
        //final Animal cat = new Cat();
        //final Flower flower = new Flower();
        final Dog theDog = new Dog();
        final Cat theCat = new Cat();

        /*
        System.out.println("dog class " + dog.getClass());
        System.out.println("dog instanceof animal " + (dog instanceof Animal));
        System.out.println("dog instanceof Dog " + (dog instanceof Dog));
        System.out.println("cat class " + cat.getClass());
        System.out.println("cat instanceof animal " + (cat instanceof Animal));
        System.out.println("cat instanceof Cat " + (cat instanceof Cat));
        System.out.println("dog instanceof cat " + (dog instanceof Cat));
        System.out.println("cat instance of dog " + (cat instanceof Dog));
        System.out.println("dog class vs cat class " + dog.getClass().equals(cat.getClass()));
        */

        System.out.println("theDog class " + theDog.getClass());
        System.out.println("theDog instanceof Animal " + (theDog instanceof Animal));
        System.out.println("theDog instanceof Dog " + (theDog instanceof Dog));



    }

}
