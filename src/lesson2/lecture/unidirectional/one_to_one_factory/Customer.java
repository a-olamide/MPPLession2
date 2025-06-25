package lesson2.lecture.unidirectional.one_to_one_factory;

public class Customer {
    private String name;
    private ShoppingCart cart;

    public Customer(String name) {
        this.name = name;
        //you can do this also
        cart = ShoppingCart.createShoppingCart(this);
    }
    public void setShoppingCart(ShoppingCart cart) {
        if(cart != null) {
            this.cart = cart;
        }
    }

    public ShoppingCart getShoppingCart() {
        return cart;
    }

}
