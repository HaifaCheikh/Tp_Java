
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.family = "Felidae";
        lion.name = "Lion";
        lion.age = 8;
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Safari Zoo";
        myZoo.city = "Paris";
        myZoo.nbrCages = 25;

        myZoo.addAnimal(lion, 0);

        System.out.println(lion);
        System.out.println(myZoo);
    }
}