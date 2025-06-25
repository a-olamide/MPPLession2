package lesson2.lecture.unidirectional.zero_to_one_factory;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private ShoppingCart() {
        items = new ArrayList<Item>();
    }
    public static ShoppingCart createShoppingCart(Customer customer) {
        if(customer == null) {
            throw new NullPointerException("customer is null");
        }
        ShoppingCart shoppingCart = new ShoppingCart();
        //set shopping cart in customer class
        customer.setShoppingCart(shoppingCart);
        return shoppingCart;
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public List<Item> getItems(){
        return items;
    }
}
