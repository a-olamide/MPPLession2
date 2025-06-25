package lesson2.lecture.bidirectional.one_to_one;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
        this.cart = new ShoppingCart(this);//pass cuurent customer object
    }
    public String getName() {
        return name;
    }
    public ShoppingCart getCart() {
        return cart;
    }

}
