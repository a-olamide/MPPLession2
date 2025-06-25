package lesson2.lecture.bidirectional.one_to_one_factory.ext;

import lesson2.lecture.bidirectional.one_to_one_factory.Customer;
import lesson2.lecture.bidirectional.one_to_one_factory.CustomerFactory;
import lesson2.lecture.bidirectional.one_to_one_factory.Item;
import lesson2.lecture.bidirectional.one_to_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.createCustomer("Olamide Akinoso");
        ShoppingCart cart = customer.getShoppingCart();
        cart.addItem(new Item("Apple"));
        cart.addItem(new Item("Banana"));
        cart.addItem(new Item("Orange"));

        System.out.println(customer.getName() + ": " + customer.getShoppingCart().getItems());

    }
}
