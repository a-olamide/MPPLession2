package lesson2.lecture.unidirectional.one_to_many;

public class Item {
    private String ItemName;

    public Item(String itemName) {
        ItemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "ItemName='" + ItemName + '\'' +
                '}';
    }
}
