package lesson2.lab.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLines;

    public Order(int orderNum) {
        this.orderNum = orderNum;
        this.orderLines = new ArrayList<>();
    }

    public void addOrderLine(String item) {
        OrderLine line = new OrderLine(item, this);
        orderLines.add(line);
    }

    public int getOrderNum() {
        return orderNum;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }
}
