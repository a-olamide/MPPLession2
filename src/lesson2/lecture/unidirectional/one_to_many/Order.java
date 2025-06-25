package lesson2.lecture.unidirectional.one_to_many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;

    //using package access so no one is able to create the instance since no customer should exist without a customer.
    //We only create an order object when we create a customer
    Order(LocalDate orderDate) {
        this.orderDate = orderDate;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderDate=" + orderDate +
                '}';
    }
}
