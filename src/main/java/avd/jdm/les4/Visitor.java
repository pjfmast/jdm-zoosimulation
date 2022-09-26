package avd.jdm.les4;

public class Visitor implements Acting, Comparable<Visitor> {
    private final String name;

    public Visitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void doAct() {
        System.out.print(name + ": ");

        int dice = (int) (Math.random() * 3);
        switch (dice) {
            case 0 -> System.out.println("walks around and enjoys stalking the animals");
            case 1 -> System.out.println("walks, talks an eats");
            case 2 -> System.out.println("imitates animals");
            default -> System.out.println("eats an animal.");
        }
    }

    @Override
    public int compareTo(Visitor other) {
        return this.name.compareTo(other.name);
    }
}
