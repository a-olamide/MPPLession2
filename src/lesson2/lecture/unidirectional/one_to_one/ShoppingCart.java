package lesson2.lecture.unidirectional.one_to_one;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    //package level so no one is able to create Shopping cart. It is only created when a customer object is created. Cos a cart is assigned to a customer
    ShoppingCart() {
        this.items = new ArrayList<>();
    }
    public List<Item> getItems() {
        return items;
    }

}
