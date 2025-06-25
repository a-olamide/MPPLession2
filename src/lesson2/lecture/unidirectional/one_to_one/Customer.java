package lesson2.lecture.unidirectional.one_to_one;

public class Customer {
    String name;
    ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
        cart = new ShoppingCart();
    }
}
