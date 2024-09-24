public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    // Constructeur par défaut
    public Animal() {
    }
    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
