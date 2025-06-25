package lesson2.lecture.bidirectional.one_to_one_factory;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
}
