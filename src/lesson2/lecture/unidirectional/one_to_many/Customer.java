package lesson2.lecture.unidirectional.one_to_many;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<Order>();
    }
    public Order addOrder() {
        Order order = new Order(LocalDate.now());
        orders.add(order);
        return order;
    }
    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", total=" + orders.toArray().length +
                ", orders=" + orders.toString() +
                '}';
    }
}
