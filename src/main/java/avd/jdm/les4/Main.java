package avd.jdm.les4;

public class Main {
    public static void main(String[] args) {

        Zoo beekseBergen = new Zoo("Beekse bergen");

        beekseBergen.addAnimal(new Animal("Bokito", AnimalType.GORILLA, 55, 300));
        beekseBergen.addAnimal(new Animal("Bokita", AnimalType.GORILLA, 45, 230));
        beekseBergen.addAnimal(new Animal("Teigetje", AnimalType.TIGER, 35, 100));
        beekseBergen.addAnimal(new Animal("Simba", AnimalType.TIGER, 25, 110));
        beekseBergen.addAnimal(new Animal("Struis", AnimalType.OSTRICH, 15, 30));

        beekseBergen.addVisitor(new Visitor("Henk"));
        beekseBergen.addVisitor(new Visitor("Sophie"));
        beekseBergen.addVisitor(new Visitor("Kees"));

        beekseBergen.simulate();

        beekseBergen.animalFrequency().forEach(((animalType, count) -> {
            System.out.println(animalType + " - " + count);
        }));

        System.out.println("Sorted by name:");
        beekseBergen.sortAndPrintAnimalsByName();
        System.out.println("Sorted by age:");
        beekseBergen.sortAndPrintAnimalsByAge();
    }
}