package lesson2.lecture.unidirectional.zero_to_one_factory.ext;

import lesson2.lecture.unidirectional.zero_to_one_factory.Customer;
import lesson2.lecture.unidirectional.zero_to_one_factory.Item;
import lesson2.lecture.unidirectional.zero_to_one_factory.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("John Doe");//no associated SC
        ShoppingCart cart= ShoppingCart.createShoppingCart(c1);
        cart.addItem(new Item("Apple"));
        cart.addItem(new Item("Banana"));
        cart.addItem(new Item("Orange"));
        System.out.println(cart.getItems());
    }
}
