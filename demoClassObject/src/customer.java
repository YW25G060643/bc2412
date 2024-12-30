import java.math.BigDecimal;

public class Customer { // Person "has" name, age
  private long id;
  private Order[] orders;
  // private boolean isVip;

  // 1. Normally Customer can be created without order.
  // public Customer(long id, Order[] orders) {
  // this.id = id;
  // this.orders = orders;
  // }

  public Customer(long id) {
    this.id = id;
    this.orders = new Order[0];
  }

  // order id -> item[]
  public Item[] getItem(long orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId)
        return order.getItems();
    }
    return new Item[0]; // or return null
  }

  // totalOrderAmount by order id
  public double getTotalOrderAmount(long orderId) {
    for (Order order : this.orders) {
      // System.out.println(order.getId() + " " + order.totalAmount());
      if (order.getId() == orderId)
        return order.totalAmount();
    }
    return -1.0;
  }

  // isVip() -> 100_000 (total amount of all orders)
  public boolean isVip() {
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Order order : this.orders) {
      total = total.add(BigDecimal.valueOf(order.totalAmount()));
    }
    return total.doubleValue() >= 100_000.0;
  }


  // 2. Customer can place order after become creating the customer account.
  public void placeOrder(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
  }

  // getOrders
  public Order[] getOrders() {
    return this.orders;
  }

  public int orderSize() {
    return this.orders.length;
  }

  public static void main(String[] args) {
    // Order[] orders = new Order[3];
    // orders[0] = new Order();
    // orders[1] = new Order();
    // orders[2] = new Order();

    Customer c1 = new Customer(1L); // create customer object and then, write down the "address" into c1.

    Order o1 = new Order(1L);
    o1.addItem(new Item("ABC", 5.4, 5));
    o1.addItem(new Item("DEF", 1.3, 3));
    c1.placeOrder(o1);

    Order o2 = new Order(2L);
    o2.addItem(new Item("IJK", 1.0, 2));
    o2.addItem(new Item("LLL", 2.0, 3));
    c1.placeOrder(o2);

    Order o3 = new Order(3L);
    o3.addItem(new Item("KKK", 1.2, 2));
    o3.addItem(new Item("JJJ", 2.2, 3));
    c1.placeOrder(o3);

    o3 = o2;

    System.out.println(c1.orderSize()); // 3
    System.out.println(c1.getTotalOrderAmount(2L)); //
    System.out.println(c1.getTotalOrderAmount(3L)); //
    System.out.println(c1.getTotalOrderAmount(1L));
    System.out.println(c1.isVip()); // false

    Order o4 = new Order(4L);
    o3.addItem(new Item("AAA", 400.0, 300));
    c1.placeOrder(o4);

    System.out.println(c1.isVip()); // true

    System.out.println(c1.getOrders()[0].getItems()[1].getPrice()); // 1.3
    // c1.getOrders -> Order[]
    // so, getOrders[0] -> Order
    // so, getOrders[0].getItems() -> Item[]
    // so, getOrders[0].getItems()[1] -> Item
    // so, getOrders[0].getItems()[1].getPrice() -> double

    System.out.println(c1.getOrders()[0].getItems()[1].totalAmount()); // 3.9 (1.3 x 3)
    System.out.println(c1.getOrders()[0].totalAmount()); // 30.9 (5.4 x 5 + 1.3 x 3)
    System.out.println(c1.getTotalOrderAmount(1)); // 30.9
  }
}