public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public Zoo() {
        this.animals = new Animal[25];
    }

    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Index hors limites.");
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}
