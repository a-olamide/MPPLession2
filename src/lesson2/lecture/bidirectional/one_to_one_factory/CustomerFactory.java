package lesson2.lecture.bidirectional.one_to_one_factory;

public class CustomerFactory {
    public static Customer createCustomer(String name) {
        Customer customer = new Customer(name);
        ShoppingCart shoppingCart = new ShoppingCart();
        customer.setShoppingCart(shoppingCart);
        shoppingCart.SetCustomer(customer);
        return customer;

    }
}
