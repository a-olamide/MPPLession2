package lesson2.lecture.unidirectional.one_to_many.ext;

import lesson2.lecture.unidirectional.one_to_many.Customer;
import lesson2.lecture.unidirectional.one_to_many.Item;
import lesson2.lecture.unidirectional.one_to_many.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Olamide Akinoso");
        Order order = customer.addOrder();
        order.addItem(new Item("Apple"));
        order.addItem(new Item("Banana"));
        order.addItem(new Item("Orange"));

        Order order2 = customer.addOrder();
        order2.addItem(new Item("Pen"));
        order2.addItem(new Item("Papper"));
        order2.addItem(new Item("Erazer"));

        System.out.println("Customer: " + customer.getName());
        System.out.println("Orders: " + customer.getOrders());
        System.out.println("Items: " + order.getItems());
    }
}
