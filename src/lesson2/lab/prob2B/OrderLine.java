package lesson2.lab.prob2B;

public class OrderLine {
    private String item;
    private Order order;

    public OrderLine(String item, Order order) {
        this.item = item;
        this.order = order;
    }

    public String getItem() {
        return item;
    }

    public Order getOrder() {
        return order;
    }
}
