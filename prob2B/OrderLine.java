package prob2B;

public class OrderLine {
    private int lineNum;
    private double price;
    private  int quantity;

private Order order;

    public OrderLine(int lineNum, double price, int quantity) {
        this.lineNum = lineNum;
        this.price = price;
        this.quantity = quantity;
        this.order=null;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
