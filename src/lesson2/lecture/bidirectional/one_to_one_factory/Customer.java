package lesson2.lecture.bidirectional.one_to_one_factory;

public class Customer {
    private String name;
    private ShoppingCart cart;

    Customer(String name) {
        this.name = name;
    }
    public void setShoppingCart(ShoppingCart cart) {
        if (this.cart == null) { //to esure we only have only one shopping cart for the customer
            this.cart = cart;
        }
    }
    public ShoppingCart getShoppingCart() {
        return cart;
    }

    public String getName() {
        return name;
    }
}
