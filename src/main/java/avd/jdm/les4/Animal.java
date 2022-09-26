package avd.jdm.les4;

public class Animal implements Acting, Comparable<Animal> {
    private final String name;
    private final AnimalType animalType;
    int age; // in months
    int weight;

    public Animal(String name, AnimalType animalType, int age, int weight) {
        this.name = name;
        this.animalType = animalType;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.name + " is a " +
                animalType.toString().toLowerCase()
                + " weights " + this.weight + " grams and is "
        + this.age + " months old.";
    }

    public String getName() {
        return name;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void doAct() {
        switch (animalType) {
            case OSTRICH -> System.out.println(name + " put head in the ground.");
            case TIGER -> System.out.println(name + " scares the vistors.");
            case GORILLA -> System.out.println(name + " hangs in a tree.");
            default -> System.out.println("name: " + " behaviour of this animal is undefined.");
        }
    }

    @Override
    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }
}
