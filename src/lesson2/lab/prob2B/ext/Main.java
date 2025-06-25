package lesson2.lab.prob2B.ext;

import lesson2.lab.prob2B.Order;
import lesson2.lab.prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1001);
        order.addOrderLine("Apple");
        order.addOrderLine("Banana");
        order.addOrderLine("Mango");

        System.out.println("Order #: " + order.getOrderNum());
        for (OrderLine line : order.getOrderLines()) {
            System.out.println(" * Item: " + line.getItem() + " (for Order #: " + line.getOrder().getOrderNum() + ")");
        }
    }
}
