package lesson2.lecture.unidirectional.one_to_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    private ShoppingCart() {
        items = new ArrayList<Item>();
    }
    public static ShoppingCart createShoppingCart(Customer customer) {
        if (customer == null) {
            throw new NullPointerException("Customer is null");
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
        return  shoppingCart;
    }
}
