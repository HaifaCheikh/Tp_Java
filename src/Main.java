
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 8, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);

        Zoo myZoo = new Zoo("Safari Zoo", "Paris", 25);
        myZoo.addAnimal(lion, 0);
        myZoo.addAnimal(elephant, 1);
        myZoo.addAnimal(crocodile, 2);

        System.out.println("Affichage via displayAnimal() : ");
        lion.displayAnimal();
        System.out.println("\nAffichage via toString() : ");
        System.out.println(lion);

        System.out.println("\nAffichage via displayZoo() : ");
        myZoo.displayZoo();
        System.out.println("\nAffichage via toString() : ");
        System.out.println(myZoo);
    }
}
