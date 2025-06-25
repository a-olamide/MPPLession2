package lesson2.lecture.bidirectional.one_to_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private Customer customer;

    ShoppingCart() {
        items = new ArrayList<Item>();
    }

    public void SetCustomer(Customer customer) {
        if(this.customer == null){ //ensure we have just one customer for a cart
            this.customer = customer;
        }
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public List<Item> getItems() {
        return items;
    }
    public Customer getCustomer() {
        return customer;
    }
}
