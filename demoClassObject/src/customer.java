public class customer {
    private long id;
    private order[] order;//reference

    /*1. normally customer can be created without order,
    public customer (long id, order[] orders){
        this.id = id
        this.orders = orders
    }
    */

    public customer(long id){
        this.id = id;
        this.order = new order[0];
    }

    /*order id = item[]
     * totalOrderAmount by order id
     */
    public item[] getItem(long orderId){
        
    }
     /* isVip() = 100_000 (total amount of all orders)
     */

    //coustomer can place order after become creating the customer account
    public void placeOrder(order order){
        order[] newOrders = new order[this.order.length + 1];
        for(int i = 0; i < this.order.length; i++){
            newOrders[i] = this.order[i];
        }
        newOrders[newOrders.length - 1] = order;
        this.order = newOrders;
    }

    public static void main(String[] args){
        customer c1 = new customer(1L);
        c1.placeOrder(new order());
    }
}