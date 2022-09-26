package avd.jdm.les4;

import java.util.*;

public class Zoo {
    private final Set<Visitor> visitors = new HashSet<>();
    private final Set<Animal> animals = new HashSet<>();

    private final String name;

    public Zoo(String name) {
        this.name = name;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulate() {
        List<Acting> zooPopulation = new ArrayList<>();
        zooPopulation.addAll(visitors);
        zooPopulation.addAll(animals);

        Collections.shuffle(zooPopulation);

        for (Acting actor : zooPopulation) {
            actor.doAct();
        }
    }

    public Map<AnimalType, Integer> animalFrequency () {
        Map<AnimalType, Integer> freqTable = new HashMap<>();
        // todo calculate frequency of each animaltype
        for (Animal animal : animals) {
            AnimalType animalType = animal.getAnimalType();

            if (freqTable.containsKey(animalType)) {
                int count = freqTable.get(animalType);
                freqTable.put(animalType, count+1);
            } else {
                freqTable.put(animalType, 1);
            }
        }
        return freqTable;
    }

    public void sortAndPrintAnimalsByName() {
        // a Set<T> cannot be sorted, so convert to a List:
       List<Animal> animalList = new ArrayList<>(animals);
       Collections.sort(animalList);
        for (Animal animal : animalList) {
            System.out.println(animal.getName());
        }
    }

    public void sortAndPrintAnimalsByAge() {
        // a Set<T> cannot be sorted, so convert to a List:
        List<Animal> animalList = new ArrayList<>(animals);
        animalList.sort((animal1, animal2) -> {
            return animal1.getAge() - animal2.getAge();
        });
        for (Animal animal : animalList) {
            System.out.println(animal.getName());
        }
    }
}
