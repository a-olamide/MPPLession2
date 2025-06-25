package lesson2.lecture.bidirectional.one_to_one.ext;

import lesson2.lecture.bidirectional.one_to_one.Customer;
import lesson2.lecture.bidirectional.one_to_one.Item;
import lesson2.lecture.bidirectional.one_to_one.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Olamide Akinoso");
        ShoppingCart cart = customer.getCart();
        cart.addItem(new Item("Apple"));
        cart.addItem(new Item("Banana"));
        cart.addItem(new Item("Orange"));
        System.out.println(customer.getName() + " added " + cart.getItems());
    }
}
