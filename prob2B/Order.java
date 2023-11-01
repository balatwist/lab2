package prob2B;

import java.util.Date;

public class Order {
private int orderNum;
private Date orderDate;

public OrderLine orderLine;

    public Order(int orderNum, Date orderDate, OrderLine orders) {
        this.orderNum = orderNum;
        this.orderDate = orderDate;
     this.orderLine=null;

    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
