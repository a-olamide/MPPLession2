package lesson2.lecture.unidirectional.zero_to_one_factory;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
    }
    public ShoppingCart getCart() {
        return cart;
    }
    public String getName() {
        return name;
    }
    public void setShoppingCart(ShoppingCart cart) {
        if (cart != null) {
            this.cart = cart;
        }

    }
}
